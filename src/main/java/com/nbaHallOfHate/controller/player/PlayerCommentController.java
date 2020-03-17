package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsRepository;
import com.nbaHallOfHate.service.player.comment.PlayerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/player-comment")
@CrossOrigin()
public class PlayerCommentController {
    private PlayerCommentService playerCommentService;
    private PlayerCommentsRepository playerCommentsRepository;

    @Autowired
    public PlayerCommentController(PlayerCommentService playerCommentService, PlayerCommentsRepository playerCommentsRepository) {
        this.playerCommentService = playerCommentService;
        this.playerCommentsRepository = playerCommentsRepository;
    }

    @PostMapping("/hate")
    public PlayerCommentsHateEntity addHateComment(@RequestBody PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception {
        return playerCommentService.addHateComment(playerCommentsHateEntity);
    }
}