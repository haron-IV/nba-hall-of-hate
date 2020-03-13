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

    public void update(Long id, PlayerEntity req) throws Exception{
        Optional<PlayerEntity> playerEntity = this.find(id);
        playerEntity.get().setName(req.getName());

        this.save(playerEntity.get());
    }

    public PlayerEntity save(PlayerEntity playerEntity) throws Exception{
        if (!this.isExist(playerEntity.getPlayerId())){
            return playerRepository.save(playerEntity);
        } else {
            throw new Exception("This card already exist in database.");
        }
    }

    public void remove(Long id) {
        playerRepository.deleteById(id);
    }

    public boolean isExist(Long id) {
        return playerRepository.existsById(id);
    }

}
