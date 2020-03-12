package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.dto.PlayerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    private List<PlayerDto> players;

    public PlayerController() {
        players = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            players.add(new PlayerDto(i, "Active"));
        }
    }

    @GetMapping("/all")
    public List<PlayerDto> getAllPlayers() {
        return players;
    }

    @GetMapping
    public PlayerDto getPlayerById(@RequestParam int id) {
        Optional<PlayerDto> player = players.stream().filter( el -> el.getId() == id ).findFirst();

        return player.get();
    }
}
