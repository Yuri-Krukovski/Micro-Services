package com.example.notification.service;

import com.example.notification.domain.model.Notification;
import com.example.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void saveNotification(Notification notification){
        notificationRepository.save(notification);
    }
}
