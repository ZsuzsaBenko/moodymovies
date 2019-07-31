package com.codecool.moodservice.model;

public enum ServiceType {
    ANIME("http://anime/anime"),
    MOVIES("http://movies/movies");


    public final String baseUrl;


    ServiceType(String url) {
        this.baseUrl = url;
    }

    //    GAME("http://games/games"),
//    SERIES("http://series/series");
}

