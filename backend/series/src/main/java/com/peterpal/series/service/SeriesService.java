package com.peterpal.series.service;

import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.repository.SeriesRepository;
import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SeriesService {

    @Autowired
    SeriesRepository seriesRepository;

    private Random random = new Random();

    public List<ScreenFun> getAll() {
        return seriesRepository.findByOrderByRatingAsc();
    }

    public ScreenFun getRandomScreenFun() {
        List<ScreenFun> all = seriesRepository.findAll();
        return all.get(random.nextInt(all.size()));
    }

    public ScreenFun oneForQuestionnaire(Questionnaire questionnaire) {
        List<Genre> genres = setGenre(questionnaire);
        List<ScreenFun> results = new ArrayList<>();
        if (questionnaire.getMasochist() == 1) {
            for (Genre genre : genres) {
                results.addAll(seriesRepository.findAllByGenre(genre));
            }
            // TODO
            // results.sort();
            results = results.subList(0, results.size() / 2);
        } else {
            for (Genre genre : genres) {
                results.addAll(seriesRepository.findAllByGenre(genre));
            }
            // TODO
            // results.sort();
            results = results.subList(results.size() / 2, results.size());
        }

        return results.get(random.nextInt(results.size()));

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
    
    /*Random random = new Random();

    @Autowired
    SeriesRepository seriesRepository;

    public ScreenFun getRandomScreenFun(List<ScreenFun> series) {
        int size = series.size();
        return series.get(randomPicker(size));
    }

    public ScreenFun getRandomScreenFunAll() {
        List<ScreenFun> series = getALl();
        int size = series.size();
        return series.get(randomPicker(size));
    }

    public int randomPicker(int size) {
        return random.nextInt(size);
    }

    public List<ScreenFun> getALl() {
        return seriesRepository.findAll();
    }

    //backend to personalize

    public List<ScreenFun> getAllInOrderByRating() {
        return seriesRepository.findByOrderByRatingAsc();
    }

    public List<ScreenFun> getFirstHalfOfTheList(List<ScreenFun> series) {
        int chunkSize = series.size() % 2 == 0 ? series.size() / 2 : (series.size() / 2) + 1;
        List<ScreenFun> firstHalf = series.subList(0, chunkSize);
        return firstHalf;
    }

    public List<ScreenFun> getSecondHalfOfTheList(List<ScreenFun> series) {
        int chunkSize = series.size() % 2 == 0 ? series.size() / 2 : (series.size() / 2) + 1;
        List<ScreenFun> secondHalf = series.subList(chunkSize, series.size());
        return secondHalf;
    }

    public List<ScreenFun> collectTheCry() {
        List<ScreenFun> cries = seriesRepository.findAllByGenre(Genre.DRAMA);
        List<ScreenFun> crimes = seriesRepository.findAllByGenre(Genre.CRIME);
        cries.addAll(crimes);
        return cries;
    }

    public List<ScreenFun> collectTheThinkLearn() {
        List<ScreenFun> learns = seriesRepository.findAllByGenre(Genre.DOCUMENTARY);
        List<ScreenFun> advs = seriesRepository.findAllByGenre(Genre.ADVENTURE);
        List<ScreenFun> fants = seriesRepository.findAllByGenre(Genre.FANTASY);
        learns.addAll(advs);
        learns.addAll(fants);
        return learns;
    }

    public List<ScreenFun> collectTheScaredThrilled() {
        List<ScreenFun> crimes = seriesRepository.findAllByGenre(Genre.CRIME);
        List<ScreenFun> advs = seriesRepository.findAllByGenre(Genre.ADVENTURE);
        crimes.addAll(advs);
        return crimes;
    }

    public List<ScreenFun> collectTheLaugh() {
        List<ScreenFun> laughs = seriesRepository.findAllByGenre(Genre.COMEDY);
        return laughs;
    }

    public ScreenFun oneForQuestionnaire(Questionnaire questionnaire) {
        replaceTheNull(questionnaire);
        List<ScreenFun> filteredSeries = getAllInOrderByRating();
        if (questionnaire.getMood() == Mood.CRY) {
            filteredSeries = collectTheCry();
        }
        if (questionnaire.getMood() == Mood.THINK || questionnaire.getMood() == Mood.LEARN) {
            filteredSeries = collectTheThinkLearn();
        }
        if (questionnaire.getMood() == Mood.BE_THRILLED || questionnaire.getMood() == Mood.BE_SCARED) {
            filteredSeries = collectTheScaredThrilled();
        }
        if (questionnaire.getMood() == Mood.LAUGH) {
            filteredSeries = collectTheLaugh();
        }

        filteredSeries.sort(Comparator.comparingDouble(ScreenFun::getRating));

        if (questionnaire.getMasochist() == 0 ) {
            filteredSeries = getSecondHalfOfTheList(filteredSeries);
        }
        if (questionnaire.getMasochist() == 1 ) {
            filteredSeries = getFirstHalfOfTheList(filteredSeries);
        }

        return getRandomScreenFun(filteredSeries);
    }

    public Questionnaire replaceTheNull(Questionnaire questionnaire) {
        if (questionnaire.getMood() == null) questionnaire.setMood(Mood.BE_THRILLED);
        return questionnaire;
    }*/


}
