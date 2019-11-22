package com.healthtrack.service;
import com.healthtrack.entity.User;
import com.healthtrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private UserRepository userRepository;

    public void create(
            String name,
            String email,
            Double height,
            String password) {

        User user = new User(name, email, height, password);
        userRepository.save(user);
    }
}
