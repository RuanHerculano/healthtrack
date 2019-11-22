package com.healthtrack.service;
import com.healthtrack.entity.User;
import com.healthtrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    UserRepository repository;

    public User create(
            String name,
            String email,
            Double height,
            String password) {

        User user = new User(name, email, height, password);
        return repository.save(user);
    }
}
