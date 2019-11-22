package com.healthtrack.business;

import com.healthtrack.entities.User;
import com.healthtrack.repositories.UserRepository;

public class SignInBusiness {
    public SignInBusiness() {}

    public User create(String email, String password) {
        UserRepository userRepository = new UserRepository();

        return userRepository.show(email);
    }
}
