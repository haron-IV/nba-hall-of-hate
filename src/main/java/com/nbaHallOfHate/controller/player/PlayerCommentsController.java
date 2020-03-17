package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.service.player.comment.PlayerCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/player-comments")
@CrossOrigin()
public class PlayerCommentsController {
    private PlayerCommentsService playerCommentsService;
    private PlayerCommentsHateRepository playerCommentsHateRepository;

    @Autowired
    public PlayerCommentsController(PlayerCommentsService playerCommentsService, PlayerCommentsHateRepository playerCommentsHateRepository) {
        this.playerCommentsService = playerCommentsService;
        this.playerCommentsHateRepository = playerCommentsHateRepository;
    }

    @GetMapping("/hate")
    public Iterable getAllHateComments() {
        return playerCommentsService.getAllHateComments();
    }

    @GetMapping("/hate/{id}")
    public Iterable<PlayerCommentsHateEntity> getAllHateComments(@PathVariable Long id) {
        return playerCommentsHateRepository.findAllHateCommentByPlayerId(id);
    }
}

