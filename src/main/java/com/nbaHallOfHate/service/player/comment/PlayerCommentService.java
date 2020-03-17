package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCommentService {
    private PlayerCommentsHateRepository playerCommentRepository;

    @Autowired
    public PlayerCommentService(PlayerCommentsHateRepository playerCommentsHateRepository) {
        this.playerCommentRepository = playerCommentsHateRepository;
    }

    public PlayerCommentsHateEntity addHateComment(PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception{
        return playerCommentRepository.save(playerCommentsHateEntity);
    }
}