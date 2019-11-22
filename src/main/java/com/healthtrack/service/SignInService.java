package com.healthtrack.service;

import com.healthtrack.entity.User;
import com.healthtrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInService {

    @Autowired
    UserRepository repository;

    public SignInService() {}

    public User create(String email, String password) {
        return new User("", "", 0.0, "");
    }
}
