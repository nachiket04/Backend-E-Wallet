package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody () UserEntry userEntry){
        userService.addUser(userEntry);
    }

    @GetMapping("/user")
    public User getUserByUserName(@RequestParam ("userName") String userName) throws UserNotFoundException {
        return userService.getByUserName(userName);
    }
}
