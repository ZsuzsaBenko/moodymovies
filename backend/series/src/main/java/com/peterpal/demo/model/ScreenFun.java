package com.peterpal.demo.model;

import lombok.*;

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

    private double rating;

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

    private String link;
}