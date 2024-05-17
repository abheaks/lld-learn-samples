package com.UberSplit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RideSharingService {

    private List<Ride> rides;

    public RideSharingService() {

        this.rides = new ArrayList<>();
    }

    public Ride bookRide(User user, Driver driver, Date rideDate,double distance,int duration) {
        Ride newRide = new Ride(generateRideId(), user, driver, rideDate);
        newRide.setDistance(distance);
        newRide.setDuration(duration);
        newRide.setFare();
        rides.add(newRide);
        return newRide;
    }

    private String generateRideId() {
        return "RIDE_" + System.currentTimeMillis();
    }
}