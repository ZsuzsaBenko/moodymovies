package com.codecool.anime.service;

import com.codecool.anime.model.Genre;
import com.codecool.anime.model.Questionnaire;
import com.codecool.anime.model.ScreenFun;
import com.codecool.anime.repository.AnimeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class AnimeService {

    private Random random = new Random();

    private AnimeRepository repository;

    @Autowired
    public AnimeService(AnimeRepository repository) {
        this.repository = repository;
    }

    public List<ScreenFun> getAll() {
        return repository.getAllByOrderByTitle();
    }

    public ScreenFun getOneRandom() {
        List<ScreenFun> animes = repository.getAllByOrderByTitle();
        return animes.get(random.nextInt(animes.size()));
    }

    public ScreenFun getOneBasedOnQuestionnaire(Questionnaire questionnaire) {
        List<Genre> genres = setGenre(questionnaire);
        List<ScreenFun> results = new ArrayList<>();
        double rating = 7;

        if (questionnaire.getMasochist() == 1) {
            for (Genre genre : genres) {
                results.addAll(repository.getScreenFunsByRatingLessThanEqualAndGenre(rating, genre));
            }
        } else {
            for (Genre genre : genres) {
                results.addAll(repository.getScreenFunsByRatingGreaterThanAndGenre(rating, genre));
            }
        }

        return results.get(random.nextInt(results.size()));
    }

    private List<Genre> setGenre(Questionnaire questionnaire) {
        switch (questionnaire.getMood()) {
            case CRY:
                return Arrays.asList(Genre.DRAMA);
            case LAUGH:
                return Arrays.asList(Genre.COMEDY, Genre.ROMANCE);
            case THINK:
                return Arrays.asList(Genre.CRIME);
            case BE_SCARED:
                return Arrays.asList(Genre.HORROR, Genre.THRILLER);
            case LEARN:
                return Arrays.asList(Genre.DOCUMENTARY);
            case BE_THRILLED:
                return Arrays.asList(Genre.ACTION, Genre.ADVENTURE, Genre.FANTASY, Genre.SCI_FI);
            default:
                return Arrays.asList(Genre.ACTION);
        }
    }
}
