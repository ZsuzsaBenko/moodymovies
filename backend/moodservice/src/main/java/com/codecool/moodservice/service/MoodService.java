package com.codecool.moodservice.service;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<ScreenFun> getAllFromChosenCategory(ServiceType serviceType) {
        return null;
    }

    public List<ScreenFun> getAllItems() {
        List<ScreenFun> everyItem = new ArrayList<>();
        List<ServiceType> serviceTypes = Arrays.asList(ServiceType.values());

        serviceTypes.forEach(serviceType -> everyItem.addAll(this.serviceCaller.getAllItems(serviceType)));

        return everyItem;
    }

    public List<ScreenFun> getOneItemFromEveryType() {
        List<ScreenFun> everyItem = new ArrayList<>();
        List<ServiceType> serviceTypes = Arrays.asList(ServiceType.values());

        serviceTypes.forEach(serviceType -> everyItem.add(this.serviceCaller.getOneItem(serviceType)));

        return everyItem;
    }
}
