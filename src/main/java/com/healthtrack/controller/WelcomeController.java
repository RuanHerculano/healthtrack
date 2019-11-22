package com.healthtrack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Welcome to healthtrack.com...");
//        model.addAttribute("msg", getMessage());
//        model.addAttribute("today", new Date());
        return "signIn";
    }

    private String getMessage() {
        return "Hello World";
    }
}