package com.healthtrack.service;

import com.healthtrack.entity.User;
import com.healthtrack.repository.UserRepository;

public class SignInService {
    public SignInService() {}

    public User create(String email, String password) {
        UserRepository userRepository = new UserRepository();

        return userRepository.show(email);
    }
}
