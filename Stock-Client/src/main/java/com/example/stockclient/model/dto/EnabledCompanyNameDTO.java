package com.example.stockclient.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EnabledCompanyNameDTO {

    String enabledCompanyName;

    public EnabledCompanyNameDTO(String enabledCompanyName) {
        this.enabledCompanyName = enabledCompanyName;
    }
}
