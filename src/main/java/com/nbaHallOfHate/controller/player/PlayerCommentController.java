package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerCommentsRespectEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.repository.PlayerCommentsRespectRepository;
import com.nbaHallOfHate.service.player.comment.PlayerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comment")
@CrossOrigin()
public class PlayerCommentController {
    private PlayerCommentService playerCommentService;
    private PlayerCommentsHateRepository playerCommentsHateRepository;
    private PlayerCommentsRespectRepository playerCommentsRespectRepository;

    @Autowired
    public PlayerCommentController(PlayerCommentService playerCommentService, PlayerCommentsHateRepository playerCommentsHateRepository, PlayerCommentsRespectRepository playerCommentsRespectRepository) {
        this.playerCommentService = playerCommentService;
        this.playerCommentsHateRepository = playerCommentsHateRepository;
        this.playerCommentsRespectRepository = playerCommentsRespectRepository;
    }

    @PostMapping("/hate")
    public PlayerCommentsHateEntity addHateComment(@RequestBody PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception {
        return playerCommentService.addHateComment(playerCommentsHateEntity);
    }

    @PostMapping("/respect")
    public PlayerCommentsRespectEntity addRespectComment(@RequestBody PlayerCommentsRespectEntity playerCommentsRespectEntity) throws Exception {
        return playerCommentService.addRespectComment(playerCommentsRespectEntity);
    }
}