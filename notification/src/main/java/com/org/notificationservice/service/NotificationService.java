package com.org.notificationservice.service;

import com.org.notificationservice.dto.EmpruntEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    @KafkaListener(topics = "emprunt-created", groupId = "notification-group")
    public void handleEmpruntCreated(EmpruntEvent event) {
        logger.info("Received emprunt created event: {}", event);
        // Simulate notification
        logger.info("Notification sent for emprunt ID: {} - User {} borrowed book {}", event.getEmpruntId(), event.getUserId(), event.getBookId());
    }
}