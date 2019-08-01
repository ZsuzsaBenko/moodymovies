package com.codecool.movies.service;

import com.codecool.movies.model.*;
import com.codecool.movies.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
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
        List<ScreenFun> movies = new ArrayList<>();
        if (questionnaire.getAge() < 18) {
            movies = movieRepository.findAllByGenre(Genre.ANIMATED);
            movies.addAll(movieRepository.findAllByGenre(Genre.FANTASY));
            movies.addAll(movieRepository.findAllByGenre(Genre.ADVENTURE));
        } else {
            if (questionnaire.getMasochist() == 1) {
                for (Genre genre : this.groupGenresForMasochists(questionnaire.getMood())) {
                    movies.addAll(movieRepository.findAllByGenre(genre));
                }
            } else {
                for (Genre genre : this.groupGenresForNormalPeople(questionnaire.getMood())) {
                    movies.addAll(movieRepository.findAllByGenre(genre));
                }
            }
        }

        int randomNumber = random.nextInt(movies.size());
        int horoscopeNumber = this.getHoroscopeNumber(questionnaire.getHoroscope());
        ScreenFun movie = (horoscopeNumber + randomNumber < movies.size()) ?
                movies.get(horoscopeNumber + randomNumber) : movies.get(randomNumber);
        log.info("Chosen movie is: " + movie.getTitle());

        return movie;
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

    private List<Genre> groupGenresForNormalPeople(Mood mood) {
        List<Genre> genres = new ArrayList<>();
        switch (mood) {
            case CRY:
                genres.addAll(Arrays.asList(Genre.DRAMA, Genre.ROMANCE, Genre.FANTASY, Genre.ADVENTURE));
                break;
            case LAUGH:
                genres.addAll(Arrays.asList(Genre.COMEDY, Genre.ROMANCE, Genre.ANIMATED));
                break;
            case LEARN:
                genres.addAll(Arrays.asList(Genre.DOCUMENTARY, Genre.DRAMA));
                break;
            case THINK:
                genres.addAll(Arrays.asList(Genre.DRAMA, Genre.CRIME, Genre.THRILLER, Genre.DOCUMENTARY,
                        Genre.SCI_FI, Genre.FANTASY));
                break;
            case BE_SCARED:
                genres.addAll(Arrays.asList(Genre.HORROR, Genre.THRILLER));
                break;
            case BE_THRILLED:
                genres.addAll(Arrays.asList(Genre.CRIME, Genre.ACTION, Genre.ADVENTURE, Genre.HORROR,
                        Genre.THRILLER, Genre.FANTASY, Genre.SCI_FI));
            break;
        }
        return genres;
    }

    private List<Genre> groupGenresForMasochists(Mood mood) {
        List<Genre> genres = new ArrayList<>();
        switch (mood) {
            case CRY:
                genres.addAll(Arrays.asList(Genre.COMEDY, Genre.DOCUMENTARY));
                break;
            case LAUGH:
                genres.addAll(Arrays.asList(Genre.DRAMA, Genre.CRIME, Genre.THRILLER, Genre.HORROR,
                        Genre.ACTION));
                break;
            case LEARN:
                genres.addAll(Arrays.asList(Genre.COMEDY, Genre.ROMANCE, Genre.CRIME, Genre.HORROR,
                        Genre.ANIMATED, Genre.FANTASY, Genre.ACTION, Genre.ADVENTURE));
                break;
            case THINK:
                genres.addAll(Arrays.asList(Genre.COMEDY, Genre.ANIMATED, Genre.ACTION, Genre.ADVENTURE));
                break;
            case BE_SCARED:
                genres.addAll(Arrays.asList(Genre.COMEDY, Genre.ROMANCE, Genre.DOCUMENTARY, Genre.ANIMATED));
                break;
            case BE_THRILLED:
                genres.addAll(Arrays.asList(Genre.DOCUMENTARY, Genre.COMEDY));
                break;
        }
        return genres;
    }

    private int getHoroscopeNumber(Horoscope horoscope) {
        return horoscope.ordinal();
    }
}
