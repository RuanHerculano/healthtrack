package com.healthtrack.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SignInController {
    @GetMapping("/signin")
    public String index() {
        return "signIn";
    }

    @PostMapping(value = "/signin", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String signIn(@RequestParam("email") String email, @RequestParam("password") String password) {
        System.out.println("Meeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(email);
        return "home";
    }
}
