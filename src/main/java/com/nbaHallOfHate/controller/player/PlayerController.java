package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public Optional<PlayerEntity> getPlayerById(@RequestParam Long id) {
        return playerService.find(id);
    }

    @PutMapping
    public void updatePlayer(@RequestBody PlayerEntity req) {
        playerService.update(req.getId(), req);
    }

    @PostMapping
    public PlayerEntity addPlayer(@RequestBody PlayerEntity playerEntity) {
        return playerService.save(playerEntity);
    }

//    Only if you need to change all properties in player dto, if you want to update only one property in dto you should use PATCH method
//    @PutMapping
//    public PlayerEntity updatePlayer(@RequestBody PlayerEntity playerEntity) {
//        return playerService.save(playerEntity);
//    }

//    @DeleteMapping
//    public boolean deletePlayer(@RequestParam int id) {
//        return players.removeIf(el -> el.getId() == id);
//    }
}
