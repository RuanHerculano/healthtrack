package com.healthtrack.service;

import com.healthtrack.entity.User;

public class SignInService {
    public SignInService() {}

    public User create(String email, String password) {
        return new User("", "", 0.0, "");
    }
}
