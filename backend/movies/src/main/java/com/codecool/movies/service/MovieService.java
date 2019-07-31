package com.codecool.movies.service;

import com.codecool.movies.model.Genre;
import com.codecool.movies.model.Questionnaire;
import com.codecool.movies.model.ScreenFun;
import com.codecool.movies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final Random random;

    public MovieService(MovieRepository movieRepository, Random random) {
        this.movieRepository = movieRepository;
        this.random = random;
    }

    public List<ScreenFun> getAllMovies() {
        return movieRepository.findAll();
    }

    public ScreenFun findMovieBasedOnProfile(Questionnaire questionnaire) {
        List<ScreenFun> movies;
        if (questionnaire.getAge() < 18) {
            movies = movieRepository.findAllByGenre(Genre.ANIMATED);
            movies.addAll(movieRepository.findAllByGenre(Genre.FANTASY));
        } else {
            movies = movieRepository.findAllByGenre(Genre.HORROR);
            movies.addAll(movieRepository.findAllByGenre(Genre.CRIME));
        }
        int randomNumber = random.nextInt(movies.size());
        return movies.get(randomNumber);
    }

    public ScreenFun getARandomMovie() {
        long movieCount = movieRepository.count();
        ScreenFun randomFun = null;
        while (randomFun == null) {
            int randomNumber = random.nextInt((int) movieCount + 1);
            randomFun = movieRepository.findById((long) randomNumber).orElse(null);
        }
        return randomFun;
    }
}
