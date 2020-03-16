package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.comment.PlayerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player-comment")
@CrossOrigin()
public class PlayerCommentController {
    private PlayerCommentService playerCommentService;

    @Autowired
    public PlayerCommentController(PlayerCommentService playerCommentService) {
        this.playerCommentService = playerCommentService;
    }

    @PostMapping("/hate")
    public PlayerCommentsHateEntity addHateComment(@RequestBody PlayerCommentsHateEntity playerCommentsHateEntity) throws  Exception {
        return playerCommentService.addHateComment(playerCommentsHateEntity);
    }
}