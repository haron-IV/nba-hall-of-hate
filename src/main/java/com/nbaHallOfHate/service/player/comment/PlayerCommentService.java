package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerCommentsRespectEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.repository.PlayerCommentsRespectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCommentService {
    private PlayerCommentsHateRepository playerCommentRepository;
    private PlayerCommentsRespectRepository playerCommentsRespectRepository;

    @Autowired
    public PlayerCommentService(PlayerCommentsHateRepository playerCommentRepository, PlayerCommentsRespectRepository playerCommentsRespectRepository) {
        this.playerCommentRepository = playerCommentRepository;
        this.playerCommentsRespectRepository = playerCommentsRespectRepository;
    }

    public PlayerCommentsHateEntity addHateComment(PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception{
        return playerCommentRepository.save(playerCommentsHateEntity);
    }

    public PlayerCommentsRespectEntity addRespectComment(PlayerCommentsRespectEntity playerCommentsRespectEntity) throws Exception{
        return playerCommentsRespectRepository.save(playerCommentsRespectEntity);
    }
}