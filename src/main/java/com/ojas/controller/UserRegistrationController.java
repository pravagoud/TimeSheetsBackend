package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.UserRegistration;
import com.ojas.service.UserRegistrationService;

@RestController
@RequestMapping("/api/user")
public class UserRegistrationController {
    
    @Autowired
    private UserRegistrationService userRegistrationService;
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistration userRegistration) {
        UserRegistration registeredUser = userRegistrationService.registerUser(userRegistration);
        return ResponseEntity.ok(registeredUser);
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestParam("email") String email, @RequestParam("password") String password) {
        boolean isLoggedIn = userRegistrationService.loginUser(email, password);
        if (isLoggedIn) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}

