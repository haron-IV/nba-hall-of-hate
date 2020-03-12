package com.nbaHallOfHate;

import com.nbaHallOfHate.dto.PlayerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class NbaHallOfHateApi {
    private List<PlayerDto> players;

    public NbaHallOfHateApi() {
        players = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            players.add(new PlayerDto("Active"));
        }
    }

    @GetMapping("/all")
    public List<PlayerDto> getAllPlayers() {
        return players;
    }
}
