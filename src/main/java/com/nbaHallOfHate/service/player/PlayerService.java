package com.nbaHallOfHate.service.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Optional<PlayerEntity> find(Integer id) {
        return playerRepository.findById(id);
    }

    public Iterable<PlayerEntity> findAll() {
        return playerRepository.findAll();
    }

    public PlayerEntity save(PlayerEntity playerEntity) {
        return playerRepository.save(playerEntity);
    }

    public void remove(Integer id) {
        playerRepository.deleteById(id);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB() {
//        for (int i = 0; i < 5; i++) {
//            save(new PlayerEntity(i, "Active"));
//        }
//    }

}
