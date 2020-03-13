package com.nbaHallOfHate.service.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayersService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Iterable<PlayerEntity> findAll() {
        return playerRepository.findAll();
    }
}
