package com.Uber.stratergies;

public class FareCalculatorStrategy {
    private static final double BASE_FARE = 2.50; // Base fare for a ride
    private static final double COST_PER_MILE = 1.50; // Cost per mile
    private static final double COST_PER_MINUTE = 0.25; // Cost per minute

    public double calculateFare(double distanceInMiles, double durationInMinutes) {
        double distanceCharge = distanceInMiles * COST_PER_MILE;
        double timeCharge = durationInMinutes * COST_PER_MINUTE;
        return BASE_FARE + distanceCharge + timeCharge;
    }
}