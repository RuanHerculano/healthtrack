package com.healthtrack.business;
import com.healthtrack.entities.User;
import com.healthtrack.repositories.UserRepository;

public class SignUpBusiness {
    public User create(
            String firstName,
            String lastName,
            String email,
            Double height,
            String password) {

        UserRepository userRepository = new UserRepository();
        return userRepository.create(firstName, lastName, email, height, password);
    }
}
