package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.PlayerService;
import com.nbaHallOfHate.service.player.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/players")
public class PlayersController {
    private PlayersService playersService;

    @Autowired
    public PlayersController(PlayersService playersService) {
        this.playersService = playersService;
    }

    // /players return all players
    // add entity for players
    @GetMapping
    public Iterable<PlayerEntity> getAllPlayers() {
        return playersService.findAll();
    }

}
