package com.nbaHallOfHate.service.player.comment;

import com.nbaHallOfHate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerCommentsService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerCommentsService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
}