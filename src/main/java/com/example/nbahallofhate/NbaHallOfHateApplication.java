package com.example.nbahallofhate;

import com.example.nbahallofhate.controller.Player;
import com.example.nbahallofhate.supplier.api.nba.ApiNbaHelper;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NbaHallOfHateApplication {

    @Autowired
    private static Player player;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(NbaHallOfHateApplication.class, args);

        ApiNbaHelper apiNbaHelper = new ApiNbaHelper();

        apiNbaHelper.getSeasons();

//        player.getPlayer();
    }


}
