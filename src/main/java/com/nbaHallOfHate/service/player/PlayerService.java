package com.nbaHallOfHate.service.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Optional<PlayerEntity> find(Long id) {
        return playerRepository.findById(id);
    }

    public void update(Long id, PlayerEntity req) {
        Optional<PlayerEntity> playerEntity = this.find(id);
        playerEntity.get().setName(req.getName());

        this.save(playerEntity.get());
    }

    public PlayerEntity save(PlayerEntity playerEntity) {
        return playerRepository.save(playerEntity);
    }

    public void remove(Long id) {
        playerRepository.deleteById(id);
    }

}
