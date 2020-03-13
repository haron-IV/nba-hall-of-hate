package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/player")
@CrossOrigin(origins = "http://localhost:8081")
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

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.remove(id);
    }
}
