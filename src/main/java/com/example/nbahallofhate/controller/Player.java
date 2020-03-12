package com.example.nbahallofhate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Player {
    private boolean active = true;

    @RequestMapping(value = "/api/player", method = RequestMethod.GET)
    public boolean getPlayer() {
        return active;
    }

}