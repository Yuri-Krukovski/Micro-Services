package com.example.stockclient.config;

import com.example.stockclient.model.Company;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.math.BigDecimal;

@JsonComponent
public class CustomCompanyDataJsonDeserializer extends StdDeserializer<Company> {

    public CustomCompanyDataJsonDeserializer() {
        this(null);
    }

    public CustomCompanyDataJsonDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Company deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException{
        JsonNode node = jp.getCodec().readTree(jp);
        JsonNode companyName = node.get("companyName");
        JsonNode latestPrice = node.get("latestPrice");
        BigDecimal priceInDecimal = new BigDecimal(latestPrice.asInt());
        return new Company(companyName.toString(),priceInDecimal);
    }
}
