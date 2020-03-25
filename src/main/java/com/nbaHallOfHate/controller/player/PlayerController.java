package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.entity.PlayerEntity;
import com.nbaHallOfHate.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/player")
@CrossOrigin()
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public Optional<PlayerEntity> getPlayerById(@PathVariable Long id) {
        playerService.addPlayerView(id);
        return playerService.find(id);
    }

    @PutMapping
    public void updatePlayer(@RequestBody PlayerEntity req) throws Exception{
        playerService.update(req.getPlayerId(), req);
    }

    @PostMapping
    public PlayerEntity addPlayer(@RequestBody PlayerEntity playerEntity) throws Exception{
        return playerService.save(playerEntity);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.remove(id);
    }

    @PutMapping("/addHate")
    public PlayerEntity addHateToPlayer(@RequestBody PlayerEntity req) throws Exception{
        return playerService.addHateToPlayer(req);
    }

    @PutMapping("/addRespect")
    public PlayerEntity addRespectToPlayer(@RequestBody PlayerEntity req) throws Exception{
        return playerService.addRespectToPlayer(req);
    }
}
