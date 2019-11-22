package com.healthtrack.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.healthtrack.business.SignUpBusiness;

@Controller
public class SignUpController {

    @GetMapping("/signup")
    public String index() {
        return "signUp";
    }

    @PostMapping(value = "/signup", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String create(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            @RequestParam("height") Double height,
            @RequestParam("password") String password) {

        SignUpBusiness signUpBusiness = new SignUpBusiness();
        signUpBusiness.create(firstName, lastName, email, height, password);

        return "home";
    }
}
