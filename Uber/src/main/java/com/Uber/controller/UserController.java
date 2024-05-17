package com.Uber.controller;


import com.Uber.models.User;
import com.Uber.repositories.UserRepository;

public class UserController {
    private final UserRepository userRepository;

    public  UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public String addUser( String name, String phone){
        User newUser=new User(generateUserId(),name,phone);
        userRepository.save(newUser);
        return newUser.getUserId();
    }
    private String generateUserId() {
        return "User" + System.currentTimeMillis();
    }
}
