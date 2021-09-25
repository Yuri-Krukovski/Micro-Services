package com.example.stockclient.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SymbolDTO {

    private Long id;

    private String symbol;

    private String name;

    private String date;

    private String type;

    private String iexId;

    private Boolean isEnabled;

    private String figi;

    private String cik;

    private String lei;
}
