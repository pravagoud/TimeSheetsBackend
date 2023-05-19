package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.UserRegistration;
import com.ojas.repository.UserRegistrationRepository;


@Service
public class UserRegistrationService {
    
    @Autowired
    private UserRegistrationRepository userRepository;
    
    public UserRegistration registerUser(UserRegistration userRegistration) {
       
        return userRepository.save(userRegistration);
    }
    
    public boolean loginUser(String email, String password) {
       
        UserRegistration user = userRepository.findByEmailAndPassword(email, password);
        return user != null;
    }
}

