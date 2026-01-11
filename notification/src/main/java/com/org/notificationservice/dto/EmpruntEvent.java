package com.org.notificationservice.dto;

import java.time.LocalDateTime;

public class EmpruntEvent {
    private Long empruntId;
    private Long userId;
    private Long bookId;
    private String eventType;
    private LocalDateTime timestamp;

    // Getters and Setters
    public Long getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "EmpruntEvent{" +
                "empruntId=" + empruntId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", eventType='" + eventType + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}