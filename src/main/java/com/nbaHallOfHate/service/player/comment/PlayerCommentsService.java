package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.entity.PlayerCommentsHateEntity;
import com.nbaHallOfHate.entity.PlayerCommentsRespectEntity;
import com.nbaHallOfHate.repository.PlayerCommentsHateRepository;
import com.nbaHallOfHate.repository.PlayerCommentsRespectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PlayerCommentsService {
    private PlayerCommentsHateRepository playerCommentsHateRepository;
    private PlayerCommentsRespectRepository playerCommentsRespectRepository;

    @Autowired
    public PlayerCommentsService(PlayerCommentsHateRepository playerCommentsHateRepository, PlayerCommentsRespectRepository playerCommentsRespectRepository) {
        this.playerCommentsHateRepository = playerCommentsHateRepository;
        this.playerCommentsRespectRepository = playerCommentsRespectRepository;
    }

    public Iterable<PlayerCommentsHateEntity> getAllHateComments() {
        return playerCommentsHateRepository.findAll();
    }

    public Iterable<PlayerCommentsHateEntity> getAllHateCommentByPlayerIdWithLimit(Long id, int limit) {
        return playerCommentsHateRepository.getAllHateCommentByPlayerIdWithLimit(id, limit);
    }

    public Iterable<PlayerCommentsRespectEntity> getAllRespectCommentByPlayerIdWithLimit(Long id, int limit) {
        return playerCommentsRespectRepository.getAllRespectCommentByPlayerIdWithLimit(id, limit);
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