package com.codecool.moodservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScreenFun {

    private Long id;

    private String title;

    private String funType;

    private double rating;

    private Genre genre;

    private String director;

    private String producer;

    private List<String> actors;

    private int year;

    private String plot;

    private int runtime;

    private String poster;

    private String trailer;

}
