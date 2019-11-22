package com.healthtrack.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.healthtrack.service.SignUpService;

@Controller
public class SignUpController {

    @GetMapping("/signup")
    public String index() {
        return "signUp";
    }

    @PostMapping(value = "/signup", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String create(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("height") Double height,
            @RequestParam("password") String password) {

        SignUpService signUpService = new SignUpService();
        signUpService.create(name, email, height, password);

        return "home";
    }
}
