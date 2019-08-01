package com.codecool.games.service;

import com.codecool.games.model.Genre;
import com.codecool.games.model.Questionnaire;
import com.codecool.games.model.ScreenFun;
import com.codecool.games.repository.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private Random random;

    public ScreenFun getRandomGame() {
        return gameRepository.getScreenFunsById(random.nextInt((int) gameRepository.count()) + 1);
    }

    public List<ScreenFun> getAllGames() {
        return gameRepository.findAll();
    }

    public ScreenFun getFilteredGame(Questionnaire questionnaire) {
        List<Genre> genres = setGenre(questionnaire);
        List<ScreenFun> results = new ArrayList<>();
        int age = setAge(questionnaire);
        double rating = 50;

        if (age > 8) {
            if (questionnaire.getMasochist() == 1) {
                assert genres != null;
                for (Genre genre : genres) {
                    results.addAll(gameRepository.getScreenFunsByRatingLessThanEqualAndGenre(rating, genre));
                }
            } else {
                assert genres != null;
                for (Genre genre : genres) {
                    results.addAll(gameRepository.getScreenFunsByRatingGreaterThanAndGenre(rating, genre));
                }
            }
        } else {
            results.addAll(gameRepository.getScreenFunsByGenre(Genre.ANIMATED));
        }

        return genres.size() > 0 ? results.get(random.nextInt(results.size())) : null;
    }

    private int setAge(Questionnaire questionnaire) {
        return questionnaire.getAge();
    }

    private List<Genre> setGenre(Questionnaire questionnaire) {
        switch (questionnaire.getMood()) {
            case CRY:
                return Arrays.asList(Genre.DRAMA, Genre.ROMANCE);
            case LAUGH:
                return Arrays.asList(Genre.COMEDY, Genre.ANIMATED);
            case THINK:
                return Arrays.asList(Genre.ACTION, Genre.DRAMA);
            case BE_SCARED:
                return Arrays.asList(Genre.HORROR);
            case LEARN:
                return Arrays.asList(Genre.DOCUMENTARY, Genre.ANIMATED);
            case BE_THRILLED:
                return Arrays.asList(Genre.ACTION, Genre.ANIMATED, Genre.SCI_FI, Genre.HORROR);
        }
        return null;
    }
}
