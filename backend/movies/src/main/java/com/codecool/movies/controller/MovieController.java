package com.codecool.movies.controller;

import com.codecool.movies.model.Questionnaire;
import com.codecool.movies.model.ScreenFun;
import com.codecool.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }



    @GetMapping("/all")
    public List<ScreenFun> getAllMovies() {
        return this.movieService.getAllMovies();
    }

    @PostMapping("/questionnaire")
    public ScreenFun findMovieBasedOnProfile(@RequestBody Questionnaire questionnaire) {
        return movieService.findMovieBasedOnProfile(questionnaire);
    }

    @GetMapping("/random")
    public ScreenFun getARandomMovie() {
        return movieService.getARandomMovie();
    }
}
