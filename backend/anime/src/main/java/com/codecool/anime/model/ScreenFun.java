package com.codecool.anime.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScreenFun {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String funType;

    private double rating;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private String director;

    private String producer;

    @ElementCollection
    private List<String> actors;

    private int year;

    @Column(columnDefinition = "LONGTEXT", length = 1024)
    private String plot;

    private int runtime;

    private String poster;

    private String trailer;
}
