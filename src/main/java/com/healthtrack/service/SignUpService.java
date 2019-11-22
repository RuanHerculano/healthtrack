package com.healthtrack.service;
import com.healthtrack.entity.User;
import com.healthtrack.repository.UserRepository;

public class SignUpService {
    public User create(
            String name,
            String email,
            Double height,
            String password) {

        UserRepository userRepository = new UserRepository();
        return userRepository.create(name, email, height, password);
    }
}
