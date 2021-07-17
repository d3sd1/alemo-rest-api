package com.alemo.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @Value("${spring.profiles.active}")
    private String profileName;

    @GetMapping("/version")
    public String version() {
        return "0.1.1-" + this.profileName;
    }
    @GetMapping("/")
    public String initial() {
        return "Welcome to Alemo!";
    }

}