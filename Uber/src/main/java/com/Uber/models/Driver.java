package com.Uber.models;

public class Driver {
    private String driverId;
    private String name;
    private String vehicleDetails;

    public Driver(String driverId, String name, String vehicleDetails) {
        this.driverId = driverId;
        this.name = name;
        this.vehicleDetails = vehicleDetails;
    }
    public String getDriverId() {
        return driverId;
    }

    // Getters and setters...
}