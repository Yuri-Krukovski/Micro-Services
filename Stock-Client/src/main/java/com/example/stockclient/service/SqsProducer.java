package com.example.stockclient.service;

import com.example.stockclient.model.dto.NotificationDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.management.Notification;
import java.time.LocalDate;

@Slf4j
@Component
public class SqsProducer {

    @Value("${cloud.aws.end-point.uri}")
    private String endPoint;

    private final QueueMessagingTemplate queueMessagingTemplate;

    public SqsProducer(QueueMessagingTemplate queueMessagingTemplate) {
        this.queueMessagingTemplate = queueMessagingTemplate;
    }

    public void putMessageOnQueue(String message, String status, String type) {
        try {
            String jsonMessage = buildJsonMessage(message, status, type);
            queueMessagingTemplate.send(endPoint, MessageBuilder.withPayload(jsonMessage).build());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    private String buildJsonMessage(String message, String status, String type) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        NotificationDTO notification = NotificationDTO.builder()
                .message(message)
                .status(status)
                .type(type)
                .created(LocalDate.now().toString())
                .createdBy("StockClientRestService")
                .modified(LocalDate.now().toString())
                .modifiedBy("ADMIN").build();

       return mapper.writeValueAsString(notification);
    }
}
