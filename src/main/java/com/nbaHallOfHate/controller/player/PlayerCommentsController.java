package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerCommentsRespectEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.repository.PlayerCommentsRespectRepository;
import com.nbaHallOfHate.service.player.comment.PlayerCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comments")
@CrossOrigin()
public class PlayerCommentsController {
    private PlayerCommentsService playerCommentsService;
    private PlayerCommentsHateRepository playerCommentsHateRepository;
    private PlayerCommentsRespectRepository playerCommentsRespectRepository;

    @Autowired
    public PlayerCommentsController(PlayerCommentsService playerCommentsService, PlayerCommentsHateRepository playerCommentsHateRepository, PlayerCommentsRespectRepository playerCommentsRespectRepository) {
        this.playerCommentsService = playerCommentsService;
        this.playerCommentsHateRepository = playerCommentsHateRepository;
        this.playerCommentsRespectRepository = playerCommentsRespectRepository;
    }

    @GetMapping("/hate")
    public Iterable getAllHateComments() {
        return playerCommentsService.getAllHateComments();
    }

    @GetMapping("/hate/{id}")
    public Iterable<PlayerCommentsHateEntity> getAllHateComments(@PathVariable Long id) {
        return playerCommentsHateRepository.findAllHateCommentByPlayerId(id);
    }

    @GetMapping("/respect/{id}")
    public Iterable<PlayerCommentsRespectEntity> getAllRespectComments(@PathVariable Long id) {
        return playerCommentsRespectRepository.findAllRespectCommentByPlayerId(id);
    }
}

