package com.codecool.moodservice.service;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {

    @Autowired
    private ServiceCaller serviceCaller;

    public ScreenFun getRandomItem(ServiceType serviceType) {
        ScreenFun result = this.serviceCaller.getOneItem(serviceType);
        return result;
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
