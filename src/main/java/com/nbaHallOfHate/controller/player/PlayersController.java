package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@CrossOrigin()
public class PlayersController {
    private PlayersService playersService;

    @Autowired
    public PlayersController(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("/{limit}")
    public List<PlayerEntity> getAllPlayers(@PathVariable int limit) {
        return playersService.findAll(limit);
    }
}
