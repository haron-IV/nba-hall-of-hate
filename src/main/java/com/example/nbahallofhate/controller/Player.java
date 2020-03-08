package com.example.nbahallofhate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/api/player")
public class Player {
    private boolean active = true;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public boolean getPlayer() {
        return active;
    }


}