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

    public int randomPicker(int size) {
        return random.nextInt(size);
    }

    public List<ScreenFun> collectTheCry() {
        List<ScreenFun> cries = seriesRepository.findAllByGenre(Genre.DRAMA);
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



}
