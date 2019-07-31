package com.codecool.moodservice.controller;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import com.codecool.moodservice.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/randomizer")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @Autowired
    private Random random;

    @GetMapping("/random-choice")
    public ScreenFun getRandomItem() {
        ServiceType randomService = ServiceType.values()[this.random.nextInt(ServiceType.values().length)];
        System.out.println(randomService);
        return this.moodService.getRandomItem(ServiceType.ANIME);
    }

    @GetMapping("/checkbox")
    public List<ScreenFun> getAllFromChosenCategory(@PathParam("serviceType") ServiceType serviceType) {
        return this.moodService.getAllFromChosenCategory(serviceType);
    }

    @GetMapping("/one-from-each")
    public List<ScreenFun> getOneItemFromEveryType() {
        return this.moodService.getOneItemFromEveryType();
    }

    @GetMapping("/all")
    public List<ScreenFun> getAllItems() {
        return this.moodService.getAllItems();
    }

    @PostMapping("/questionnaire")
    public ScreenFun evaluateQuestionnaire(@RequestBody Questionnaire questionnaire) {
        return this.moodService.getItemBasedOnQuestionnaire(questionnaire);
    }

}
