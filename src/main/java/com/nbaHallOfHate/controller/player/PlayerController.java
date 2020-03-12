package com.nbaHallOfHate.controller.player;

import com.nbaHallOfHate.dto.PlayerDto;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public boolean addPlayer(@RequestBody PlayerDto playerDto) {
        return players.add(playerDto);
    }

//    Only if you need to change all properties in player dto, if you want to update only one property in dto you should use PATCH method
    @PutMapping
    public boolean updatePlayer(@RequestBody PlayerDto playerDto) {
        return players.add(playerDto);
    }

    @DeleteMapping
    public boolean deletePlayer(@RequestParam int id) {
        return players.removeIf(el -> el.getId() == id);
    }
}
