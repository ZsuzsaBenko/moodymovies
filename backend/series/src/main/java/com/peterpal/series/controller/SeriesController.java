package com.peterpal.series.controller;

import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.model.ScreenFun;
import com.peterpal.series.service.SeriesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @GetMapping("/all")
    public List<ScreenFun> getAllScreenFun() {
        return seriesService.getAll();
    }

    @GetMapping("/random")
    public ScreenFun getOneRandom() {
        return seriesService.getRandomScreenFun();
    }

    @PostMapping("/questionnaire")
    public ScreenFun getOneBasedOnQuestionnaire(@RequestBody Questionnaire questionnaire) {
        return seriesService.getOneForQuestionnaire(questionnaire);
    }
}
