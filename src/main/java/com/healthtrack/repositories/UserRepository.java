package com.healthtrack.repositories;

import com.healthtrack.entities.User;

public class UserRepository {
    public UserRepository() {}

    public User create(
            String firstName,
            String lastName,
            String email,
            Double height,
            String password) {

        return new User(firstName, lastName, email, height, password);
    }

    public User show(String email) {
        return new User("", "", "", 0.0, "12345678");
    }
}
