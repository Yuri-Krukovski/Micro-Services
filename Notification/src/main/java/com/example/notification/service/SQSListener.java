package com.example.notification.service;

import com.example.notification.domain.model.Notification;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SQSListener {

    private final NotificationService notificationService;

    public SQSListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @SqsListener("Notification-queue")
    @MessageMapping
    public void receiveMessage(String message) {
        log.info("received new SQS message");

        log.info("Attempting to build and persist notification from SQS message");

        var notification = buildNotificationFromMessage(message);
        notificationService.saveNotification(notification);

        log.info("Successfully saved new notification from SQS message");
    }

    private Notification buildNotificationFromMessage(String message) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(message, Notification.class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}