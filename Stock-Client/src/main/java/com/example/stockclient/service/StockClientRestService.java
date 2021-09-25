package com.example.stockclient.service;


import com.example.stockclient.model.Company;
import com.example.stockclient.model.dto.EnabledCompanyNameDTO;
import com.example.stockclient.model.dto.SymbolDTO;
import com.example.stockclient.repository.CompanyRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

import static com.example.stockclient.config.Constants.Endpoints.COMPANY_DATA_API;
import static com.example.stockclient.config.Constants.Endpoints.SYMBOLS_API;

@Service
@Slf4j
public class StockClientRestService {

    private final RestTemplate restTemplate;
    private final CompanyRepository repository;
    private final SqsProducer sqsProducerMessage;


    @Autowired
    public StockClientRestService(RestTemplateBuilder restTemplateBuilder, CompanyRepository repository, SqsProducer sqsProducerMessage) {
        this.restTemplate = restTemplateBuilder.build();
        this.repository = repository;
        this.sqsProducerMessage = sqsProducerMessage;
    }

    public Queue<EnabledCompanyNameDTO> getAllEnabledCompanies() {
        ResponseEntity<List<SymbolDTO>> responseEntity =
                restTemplate.exchange(
                        SYMBOLS_API,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        }
                );

        List<SymbolDTO> symbolDTOList;
        if (!Objects.requireNonNull(responseEntity.getBody()).isEmpty()) {
            symbolDTOList = responseEntity.getBody();
            Collections.shuffle(symbolDTOList);

            return symbolDTOList.stream()
                    .filter(SymbolDTO::getIsEnabled)
                    .map(symbolDTO -> new EnabledCompanyNameDTO(symbolDTO.getSymbol())).limit(20)
                    .collect(Collectors.toCollection(LinkedBlockingQueue::new));
        }
        throw new ResourceNotFoundException("Unable to retrieve enabled companies");
    }

    @PostConstruct
    @Transactional
    public void processCompanyRequests() {
        Queue<EnabledCompanyNameDTO> allEnabledCompanies = getAllEnabledCompanies();
        try {
            allEnabledCompanies.parallelStream()
                    .map((companyNameDTO -> this.call(companyNameDTO.getEnabledCompanyName())))
                    .map(CompletableFuture::join)
                    .collect(Collectors.collectingAndThen(Collectors.toList(), repository::saveAll));

            sqsProducerMessage.putMessageOnQueue("Successfully saved companies to the database","NEW","INFO");

            repository.findTopFiveOrderByPrice().forEach(System.out::println);
        }
        catch (Exception e){
            sqsProducerMessage.putMessageOnQueue(e.getMessage(),"NEW","ERROR");
        }
    }

    @Async
    public CompletableFuture<Company> call(String companyName) {
        var sandboxURL = String.format(COMPANY_DATA_API, companyName);
        var response = restTemplate.getForObject(sandboxURL, String.class);

        Company company;
        try {
            company = new ObjectMapper().readValue(response, Company.class);
            return CompletableFuture.completedFuture(company);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Unable to retrieve enabled companies" + e.getMessage());
        }
    }
}



