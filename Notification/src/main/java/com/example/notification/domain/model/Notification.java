package com.example.notification.domain.model;

import com.example.notification.config.CustomNotificationJsonDeserializer;
import com.example.notification.domain.enums.Status;
import com.example.notification.domain.enums.Type;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@Builder
@JsonDeserialize(using = CustomNotificationJsonDeserializer.class)
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    private LocalDate created;

    private LocalDate modified;

    private String createdBy;

    private String modifiedBy;

    private Status status;

    private Type type;

    public Notification() {
    }
}
