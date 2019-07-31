package com.codecool.moodservice.service;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class MoodService {

    @Autowired
    private ServiceCaller serviceCaller;

    @Autowired
    private Random random;

    public ScreenFun getRandomItem() {
        ServiceType randomService = ServiceType.values()[this.random.nextInt(ServiceType.values().length)];

        // TODO change ServiceType.ANIME to randomService when every service is done
        ScreenFun result = this.serviceCaller.getOneItem(ServiceType.ANIME);
        return result;
    }

    public ScreenFun getItemBasedOnQuestionnaire(Questionnaire questionnaire) {
        List<ScreenFun> everyItem = new ArrayList<>();
        List<ServiceType> serviceTypes = Arrays.asList(ServiceType.values());
        serviceTypes.forEach(serviceType -> everyItem.add(this.serviceCaller.getItemBasedOnQuestionnaire(serviceType, questionnaire)));

        ScreenFun result = everyItem.get(random.nextInt(everyItem.size()));
        return result;
    }

    public List<ScreenFun> getAllFromChosenCategory(ServiceType serviceType) {
        return this.serviceCaller.getAllItems(serviceType);
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
