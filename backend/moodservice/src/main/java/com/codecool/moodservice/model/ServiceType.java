package com.codecool.moodservice.model;

public enum ServiceType {
    ANIME("http://anime/anime"),
    GAME("http://games/games"),
    MOVIE("http://movies/movies"),
    SERIES("http://series/series");


    public final String baseUrl;


    ServiceType(String url) {
        this.baseUrl = url;
    }
}

