package com.Uber.controller;


import com.Uber.models.Driver;
import com.Uber.repositories.DriverRepository;

public class DriverController {

    private final DriverRepository driverRepository;

    public  DriverController(DriverRepository driverRepository){
        this.driverRepository=driverRepository;
    }
    public String addDriver( String name, String vehicleDetails){
        Driver newDriver=new Driver(generateDriverId(),name,vehicleDetails);
        driverRepository.save(newDriver);
        return newDriver.getDriverId();
    }
    private String generateDriverId() {
        return "Driver" + System.currentTimeMillis();
    }
}
