package com.codecool.moodservice.service;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {

    @Autowired
    private AnimeServiceCaller animeServiceCaller;

    @Autowired
    private GameServiceCaller gameServiceCaller;

    @Autowired
    private MovieServiceCaller movieServiceCaller;

    @Autowired
    private SeriesServiceCaller seriesServiceCaller;


    public ScreenFun getRandomItem() {
        return null;
    }

    public ScreenFun getItemBasedOnQuestionnaire(Questionnaire questionnaire) {
        return null;
    }

    public List<ScreenFun> getRandomFromEverywhere() {
        return null;
    }

    public List<ScreenFun> getAllItems() {
        return null;
    }

    public List<ScreenFun> getOneItemFromEveryType() {
        return null;
    }
}
