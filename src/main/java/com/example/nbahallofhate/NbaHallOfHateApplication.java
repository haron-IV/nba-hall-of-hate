package com.example.nbahallofhate;

import com.example.nbahallofhate.supplier.api.nba.ApiNbaHelper;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NbaHallOfHateApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(NbaHallOfHateApplication.class, args);

        ApiNbaHelper apiNbaHelper = new ApiNbaHelper();

        apiNbaHelper.getSeasons();
    }


}
