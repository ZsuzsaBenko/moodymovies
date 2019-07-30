package com.codecool.movies.model;

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

    private int rating;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ElementCollection
    private List<String> staff;

    @ElementCollection
    private List<String> actors;

    private int year;

    private String plot;

    private int runtime;

    private String poster;

    private String trailer;
}
