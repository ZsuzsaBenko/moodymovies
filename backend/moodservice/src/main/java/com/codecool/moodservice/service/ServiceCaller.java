package com.codecool.moodservice.service;

import com.codecool.moodservice.model.Genre;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class ServiceCaller {

    @Autowired
    private RestTemplate restTemplate;

    private String currentUrl;

    public ScreenFun getOneItem(ServiceType serviceType) {
        this.currentUrl = serviceType.baseUrl + "/all";
        ScreenFun randomItem = this.restTemplate.getForEntity(this.currentUrl, ScreenFun.class).getBody();
        return randomItem;
    }

}
