package com.healthtrack.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.healthtrack.entities.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("/signin")
    public String signIn(@RequestBody User user) {
        System.out.println("Meeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(user);
        return "home";
    }

    @GetMapping("/signup")
    public String signUp(Model model) {
        logger.debug("New account");
        return "signUp";
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