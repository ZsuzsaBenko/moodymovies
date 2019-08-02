package com.peterpal.series.service;

import com.peterpal.series.model.Genre;
import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.model.ScreenFun;
import com.peterpal.series.repository.SeriesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    private Random random = new Random();

    public List<ScreenFun> getAll() {
        return seriesRepository.findByOrderByRatingAsc();
    }

    public ScreenFun getRandomScreenFun() {
        List<ScreenFun> allItems = seriesRepository.findAll();
        return allItems.get(random.nextInt(allItems.size()));
    }

    public ScreenFun getOneForQuestionnaire(Questionnaire questionnaire) {
        List<Genre> genres = setGenre(questionnaire);

        List<ScreenFun> results = seriesRepository.findAllByGenreIn(genres);
        results = getSortedScreenFun(questionnaire, results);

        return results.get(random.nextInt(results.size()));

    }

    private List<ScreenFun> getSortedScreenFun(Questionnaire questionnaire, List<ScreenFun> results) {
        results.sort(Comparator.comparing(ScreenFun::getRating));

        if (questionnaire.getMasochist() == 1) {
            results = results.subList(0, results.size() / 2);
        } else {
            results = results.subList(results.size() / 2, results.size());
        }

        return results;
    }

    private List<Genre> setGenre(Questionnaire questionnaire) {
        switch (questionnaire.getMood()) {
            case CRY:
                return Arrays.asList(Genre.DRAMA, Genre.CRIME);
            case LAUGH:
                return Arrays.asList(Genre.COMEDY);
            case THINK:
            case LEARN:
                return Arrays.asList(Genre.DOCUMENTARY, Genre.ADVENTURE, Genre.FANTASY);
            case BE_SCARED:
            case BE_THRILLED:
                return Arrays.asList(Genre.CRIME, Genre.ADVENTURE);
            default:
                return Arrays.asList(Genre.FANTASY);
        }
    }
}
