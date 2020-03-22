package com.nbaHallOfHate.service.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayersService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerEntity> findAll(int limit) {
        return playerRepository.findAllPlayers(limit);
    }
}
