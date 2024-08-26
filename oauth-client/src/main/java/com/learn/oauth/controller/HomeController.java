package com.learn.oauth.controller;

import com.learn.oauth.config.WelcomeClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class HomeController {

    private final WelcomeClient welcomeClient;

    public HomeController(WelcomeClient welcomeClient) {
        this.welcomeClient = welcomeClient;
    }

    @GetMapping
    public String home() {

        String welcome = welcomeClient.getWelcome();
        return "Hello Welcome!";
    }
}
