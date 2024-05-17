package com.Uber.controller;


import com.Uber.models.Driver;
import com.Uber.models.User;
import com.Uber.repositories.DriverRepository;
import com.Uber.repositories.UserRepository;
import com.Uber.services.RideSharingService;

import java.util.Date;
import java.util.Optional;

public class RideController {

    private final RideSharingService rideSharingService;
    private final DriverRepository driverRepository;
    private final UserRepository userRepository;

    public RideController(RideSharingService rideSharingService, DriverRepository driverRepository, UserRepository userRepository){
        this.rideSharingService=rideSharingService;
        this.driverRepository = driverRepository;
        this.userRepository = userRepository;
    }

    public void bookRide(String userId,String driverId,Date date,double distance,int duration){

        Optional<User> newUser=userRepository.findUserById(userId);
        Optional<Driver> neeDriver=driverRepository.findDriverById(driverId);
        rideSharingService.bookRide(newUser.orElse(null),neeDriver.orElse(null),date,distance,duration);

    }
}
