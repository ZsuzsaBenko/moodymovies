package com.peterpal.series.service;

import com.peterpal.series.repository.SeriesRepository;
import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SeriesService {


    Random random = new Random();

    @Autowired
    SeriesRepository seriesRepository;

    public ScreenFun getRandomScreenFun() {
        List<ScreenFun> allScreenFun = seriesRepository.findAll();
        int size = allScreenFun.size();
        return allScreenFun.get(randomPicker(size));
    }

    public int randomPicker(int size) {
        return random.nextInt(size);
    }


    //backend to personalize

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

    public List<ScreenFun> collectForDay() {
        List<ScreenFun> forDays = collectTheThinkLearn();
        List<ScreenFun> forDays2 = collectTheLaugh();
        forDays.addAll(forDays2);
        return forDays;
    }

    public List<ScreenFun> collectForNight() {
        List<ScreenFun> forNigths = collectTheCry();
        List<ScreenFun> forNigths2 = collectTheScaredThrilled();
        forNigths.addAll(forNigths2);
        return forNigths;
    }



}
