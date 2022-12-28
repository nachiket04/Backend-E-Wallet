package com.example.services;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(){
        super("User Not Found");
    }
}
