package com.healthtrack.entity;

import java.time.LocalDateTime;

public class PhysicalActivity {
    private String name;
    private int minutes;
    private Double caloriesConsumed;
    private String user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PhysicalActivity(String name, int minutes, Double caloriesConsumed, String user, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.minutes = minutes;
        this.caloriesConsumed = caloriesConsumed;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public Double getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public String getUser() {
        return user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}