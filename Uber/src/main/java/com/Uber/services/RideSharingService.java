package com.Uber.services;



import com.Uber.models.Driver;
import com.Uber.models.Ride;
import com.Uber.models.User;
import com.Uber.repositories.RideRepository;
import com.Uber.stratergies.FareCalculatorStrategy;

import java.util.Date;

public class RideSharingService {

   private final RideRepository rideRepository;

    public RideSharingService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public Ride bookRide(User user, Driver driver, Date rideDate, double distance, int duration) {
        Ride newRide = new Ride(generateRideId(), user, driver, rideDate);
        newRide.setDistance(distance);
        newRide.setDuration(duration);
        FareCalculatorStrategy fareCalculator = new FareCalculatorStrategy();

        newRide.setFare(fareCalculator.calculateFare(distance, duration));

        rideRepository.save(newRide);
        return newRide;
    }

    private String generateRideId() {
        return "RIDE_" + System.currentTimeMillis();
    }
}