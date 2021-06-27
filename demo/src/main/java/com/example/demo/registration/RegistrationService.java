package com.example.demo.registration;

import org.springframework.stereotype.Service;

import javax.persistence.SequenceGenerator;

@Service
public class RegistrationService {
    public String register(RegistrationService request) {
        return "works";
    }
}
