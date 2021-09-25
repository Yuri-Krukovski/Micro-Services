package com.example.stockclient.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class NotificationDTO {

    private String message;
    private String type;
    private String status;
    private String created;
    private String createdBy;
    private String modified;
    private String modifiedBy;
}
