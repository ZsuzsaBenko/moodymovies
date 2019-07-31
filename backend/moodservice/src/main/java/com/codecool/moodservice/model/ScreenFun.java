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

    private int rating;

    private Genre genre;

    private List staff;

    private List actors;

    private int year;

    private String plot;

    private int runtime;

    private String poster;

    private String link;

}
