package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comments")
@CrossOrigin()
public class PlayerCommentsController {
    private PlayerService playerService;

    @Autowired
    public PlayerCommentsController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/hate")
    public void getAllHateComments() {

    }
}

