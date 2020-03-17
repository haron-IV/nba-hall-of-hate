package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.service.player.comment.PlayerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comment")
@CrossOrigin()
public class PlayerCommentController {
    private PlayerCommentService playerCommentService;
    private PlayerCommentsHateRepository playerCommentsHateRepository;

    @Autowired
    public PlayerCommentController(PlayerCommentService playerCommentService, PlayerCommentsHateRepository playerCommentsHateRepository) {
        this.playerCommentService = playerCommentService;
        this.playerCommentsHateRepository = playerCommentsHateRepository;
    }

    @PostMapping("/hate")
    public PlayerCommentsHateEntity addHateComment(@RequestBody PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception {
        return playerCommentService.addHateComment(playerCommentsHateEntity);
    }
}