package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PlayerCommentsService {
    private PlayerCommentsRepository playerCommentsRepository;

    @Autowired
    public PlayerCommentsService(PlayerCommentsRepository playerCommentsRepository) {
        this.playerCommentsRepository = playerCommentsRepository;
    }

    public Iterable<PlayerCommentsHateEntity> getAllHateComments() {
        return playerCommentsRepository.findAll();
    }

    @GetMapping("/hate/{id}")
    public Iterable<PlayerCommentsHateEntity> showAllHateCommentForPlayerId(@PathVariable Long id) throws Exception {
        return playerCommentsRepository.findAllHateCommentByPlayerId(id);
    }

//    TODO: add get all respect comments

//    public PlayerCommentsHateEntity addHateComment(PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception{
//        return playerCommentsRepository.save(playerCommentsHateEntity);
//    }
}