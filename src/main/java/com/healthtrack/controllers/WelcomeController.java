package com.healthtrack.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.healthtrack.entities.User;

@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Welcome to healthtrack.com...");
//        model.addAttribute("msg", getMessage());
//        model.addAttribute("today", new Date());
        return "index";
    }

    @PostMapping(value = "/signin", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String signIn(@RequestParam("email") String email, @RequestParam("password") String password) {
        System.out.println("Meeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(email);
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model) {
        logger.debug("Home");
        return "home";
    }

    private String getMessage() {
        return "Hello World";
    }
}