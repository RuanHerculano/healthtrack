package com.healthtrack.controller;

import com.healthtrack.service.SignInService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {

    @GetMapping("/signin")
    public String index() {
        return "signIn";
    }

    @PostMapping(value = "/signin", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String signIn(@RequestParam("email") String email, @RequestParam("password") String password) {
        SignInService signInService = new SignInService();
        signInService.create(email, password);
        return "home";
    }
}
