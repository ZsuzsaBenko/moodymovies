package com.codecool.moodservice.model;

public enum ServiceType {
    ANIME("http://anime/anime"),
    MOVIES("http://movies/movies"),
    GAMES("http://games/games");


    public final String baseUrl;


    ServiceType(String url) {
        this.baseUrl = url;
    }

//    SERIES("http://series/series");
}

