package com.codecool.moodservice.controller;

import com.codecool.moodservice.model.Questionnaire;
import com.codecool.moodservice.model.ScreenFun;
import com.codecool.moodservice.model.ServiceType;
import com.codecool.moodservice.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/randomizer")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @GetMapping("/random-choice")
    public ScreenFun getRandomItem(ServiceType serviceType) {
        return this.moodService.getRandomItem(ServiceType.ANIME);
    }

    @GetMapping("/checkbox")
    public List<ScreenFun> getRandomItemsByCheckBox() {
        return this.moodService.getRandomFromEverywhere();
    }

    @GetMapping("/one-from-all")
    public List<ScreenFun> getOneItemFromEveryType() {
        return this.moodService.getOneItemFromEveryType();
    }

    @GetMapping("/all")
    public List<ScreenFun> getAllItems() {
        return this.moodService.getAllItems(ServiceType.ANIME);
    }

    @PostMapping("/questionnaire")
    public ScreenFun evaluateQuestionnaire(@RequestBody Questionnaire questionnaire) {
        return this.moodService.getItemBasedOnQuestionnaire(questionnaire);
    }

}
