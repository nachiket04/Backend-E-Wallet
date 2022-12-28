package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntry userEntry){
        User user = User.builder().userName(userEntry.getUserName())
                        .name(userEntry.getName())
                        .email(userEntry.getEmail())
                        .mobNo(userEntry.getMobNo())
                        .build();

        userRepository.save(user);
    }

    public User getByUserName(String userName) throws UserNotFoundException {
        try {
            User user = userRepository.findByUserName(userName);
            if(user == null){
                throw new UserNotFoundException();
            }
            return user;
        }
        catch (Exception e){
            throw new UserNotFoundException();
        }

    }
}
