package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCommentService {
    private PlayerCommentsRepository playerCommentRepository;

    @Autowired
    public PlayerCommentService(PlayerCommentsRepository playerCommentsRepository) {
        this.playerCommentRepository = playerCommentsRepository;
    }

    public PlayerCommentsHateEntity addHateComment(PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception{
        return playerCommentRepository.save(playerCommentsHateEntity);
    }
}