package com.Uber.models;

public class User {
    private String userId;
    private String name;
    private String phone;



    public User(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }
    public String getUserId() {
        return userId;
    }

    // Getters and setters...
}