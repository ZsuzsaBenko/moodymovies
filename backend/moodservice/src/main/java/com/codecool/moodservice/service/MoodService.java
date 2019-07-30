package com.codecool.moodservice.service;

import com.codecool.moodservice.model.ScreenFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoodService {

    @Autowired
    private MovieServiceCaller movieServiceCaller;


    public ScreenFun getRandomItem() {
        return null;
    }
}
