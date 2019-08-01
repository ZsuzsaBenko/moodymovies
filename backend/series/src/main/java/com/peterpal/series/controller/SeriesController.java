package com.peterpal.series.controller;

import com.peterpal.series.model.Mood;
import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.model.ScreenFun;
import com.peterpal.series.repository.SeriesRepository;
import com.peterpal.series.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;



    @GetMapping("/all")
    public List<ScreenFun> getAllScreenFun() {
        return seriesService.getALl();
    }


    @GetMapping("/random")
    public ScreenFun getRandom() {
        return seriesService.getRandomScreenFunAll();
    }

    @PostMapping("/questionnaire")
    public ScreenFun getPersonal(@RequestBody Questionnaire questionnaire) {
        return seriesService.oneForQuestionnaire(questionnaire);
    }

}
