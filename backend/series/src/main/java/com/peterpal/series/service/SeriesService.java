package com.peterpal.series.service;

import com.peterpal.series.model.Mood;
import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.repository.SeriesRepository;
import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

@Service
public class SeriesService {


    Random random = new Random();

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
    }



}
