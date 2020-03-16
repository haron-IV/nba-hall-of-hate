package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.service.player.comment.PlayerCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comments")
@CrossOrigin()
public class PlayerCommentsController {
    private PlayerCommentsService playerCommentsService;

    @Autowired
    public PlayerCommentsController(PlayerCommentsService playerCommentsService) {
        this.playerCommentsService = playerCommentsService;
    }

    @GetMapping("/hate")
    public Iterable getAllHateComments() {
        return playerCommentsService.getAllHateComments();
    }
}

