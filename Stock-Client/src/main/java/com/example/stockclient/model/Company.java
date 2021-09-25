package com.example.stockclient.model;

import com.example.stockclient.config.CustomCompanyDataJsonDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = CustomCompanyDataJsonDeserializer.class)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonProperty("symbol")
    private String companyName;

    @Column
    @JsonProperty("latestPrice")
    private BigDecimal latestPrice;

    public Company(String companyName, BigDecimal latestPrice) {
        this.companyName = companyName;
        this.latestPrice = latestPrice;
    }
}
