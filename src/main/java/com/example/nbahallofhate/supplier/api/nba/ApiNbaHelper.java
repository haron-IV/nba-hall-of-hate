package com.example.nbahallofhate.supplier.api.nba;

import com.example.nbahallofhate.supplier.api.nba.dto.ApiNbaSeasonsResponseDto;
import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
//import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.*;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Base64;


@Service
public class ApiNbaHelper {
    public final OkHttpClient client;

    public ApiNbaHelper() {
        this.client = new OkHttpClient();
    }

    String user = "HallOfHate";
    private String apiHost = "api-nba-v1.p.rapidapi.com";
    private static final MediaType JSON_TYPE = MediaType.parse("application/json; charset=utf-8");

    Gson gson = new Gson();
    RestTemplate restTemplate = new RestTemplate();


    private String getUriForPath(String path) {
        return this.apiHost + path;
    }

    private String getPassword(String body) {
        return "";
    }

    private HttpHeaders getHeaders(String password) {
        HttpHeaders headers = new HttpHeaders();
        String encodedString = Base64.getEncoder().encodeToString((this.user + ":" + password).getBytes());
        headers.set("Authorization", "Basic " + encodedString);
        return headers;
    }

    public <T, N> N post(String path, Class<N> responseClass, T object) {
        String uriForPath = this.getUriForPath(path);
        String textBody = this.gson.toJson(object);
        String password = this.getPassword(textBody);
        HttpEntity<Object> request = new HttpEntity(object, this.getHeaders(password));
        ResponseEntity<String> response = this.restTemplate.exchange(uriForPath, HttpMethod.POST, request, String.class, new Object[0]);
        String body = (String) response.getBody();
        return this.gson.fromJson(body, responseClass);
    }

    public <T, N> N get(String path, Class<N> requestClass, T object) {
        String uriForPath = this.getUriForPath(path);
        String textBody = this.gson.toJson(object);
        String password = this.getPassword(textBody);
        HttpEntity<Object> request = new HttpEntity(object, this.getHeaders(password));
        ResponseEntity<String> response = this.restTemplate.exchange(uriForPath, HttpMethod.GET, request, String.class, new Object[0]);
        String body = (String) response.getBody();
        return this.gson.fromJson(body, requestClass);
    }

    public ApiNbaSeasonsResponseDto getSeasons() throws IOException {
        ApiNbaHelper apiNbaHelper = new ApiNbaHelper();

        Request request = new Request.Builder()
                .url("https://api-nba-v1.p.rapidapi.com/seasons/")
                .get()
                .addHeader("x-rapidapi-host", "api-nba-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "4137e79b32msh43112b0a5a690e6p170fe7jsnab0eef0292ea")
                .build();

        String responseString = client.newCall(request)
                .execute()
                .body().string();

        return new Gson().fromJson(responseString, ApiNbaSeasonsResponseDto.class);
    }
}
