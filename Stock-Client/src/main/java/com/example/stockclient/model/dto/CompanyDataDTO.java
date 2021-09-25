package com.example.stockclient.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CompanyDataDTO {

    private String companyName;
    private BigDecimal latestPrice;


//    public static CompanyDataDTO companyToCompanyDataDTO(Company company){
//        CompanyDataDTO dto = new CompanyDataDTO();
//        dto.setCompanyName(company.getName());
//        dto.setLatestPrice(company.getPrice());
//        return dto;
//    }
//
//    public static Company companyDtoToCompanyEntity(CompanyDataDTO dto){
//        Company entity = new Company();
//        entity.setName(dto.getCompanyName());
//        entity.setPrice(dto.getLatestPrice());
//        return entity;
//    }

    @Override
    public String toString() {
        return
                "Company Name :::  " + companyName  + "\n" + "> Latest Price :::" + latestPrice;
    }
}
