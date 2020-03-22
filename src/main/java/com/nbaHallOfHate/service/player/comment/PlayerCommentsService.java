package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PlayerCommentsService {
    private PlayerCommentsHateRepository playerCommentsHateRepository;

    @Autowired
    public PlayerCommentsService(PlayerCommentsHateRepository playerCommentsHateRepository) {
        this.playerCommentsHateRepository = playerCommentsHateRepository;
    }

    public Iterable<PlayerCommentsHateEntity> getAllHateComments() {
        return playerCommentsHateRepository.findAll();
    }

    public Iterable<PlayerCommentsHateEntity> getAllHateCommentByPlayerIdWithLimit(Long id, int limit) {
        return playerCommentsHateRepository.getAllHateCommentByPlayerIdWithLimit(id, limit);
    }

    //TODO: move this to controller file
    @GetMapping("/hate/{id}")
    public Iterable<PlayerCommentsHateEntity> showAllHateCommentForPlayerId(@PathVariable Long id) throws Exception {
        return playerCommentsHateRepository.findAllHateCommentByPlayerId(id);
    }

//    TODO: add get all respect comments

//    public PlayerCommentsHateEntity addHateComment(PlayerCommentsHateEntity playerCommentsHateEntity) throws Exception{
//        return playerCommentsRepository.save(playerCommentsHateEntity);
//    }
}