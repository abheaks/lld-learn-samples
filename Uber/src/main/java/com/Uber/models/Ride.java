package com.Uber.models;





import java.util.Date;

public class Ride {
    private String rideId;
    private User user;
    private Driver driver;
    private Date rideDate;
    private double fare;
    private double distance;
    private int duration;

    public Ride(String rideId, User user, Driver driver, Date rideDate) {
        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.rideDate = rideDate;
    }
    public String getRideId() {
        return rideId;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void setFare(double fare) {

        this.fare = fare ;
    }

    // Getters and setters...
}