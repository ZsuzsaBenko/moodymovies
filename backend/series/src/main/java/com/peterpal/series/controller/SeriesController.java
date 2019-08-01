package com.peterpal.series.controller;

import com.peterpal.series.model.Mood;
import com.peterpal.series.model.Questionnaire;
import com.peterpal.series.model.ScreenFun;
import com.peterpal.series.repository.SeriesRepository;
import com.peterpal.series.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return seriesService.getRandomScreenFun();
    }

    @GetMapping("/questionnaire")
    public ScreenFun getPersonal(@RequestBody Questionnaire questionnaire) {
        return seriesService.getALl().get(0);
    }

}
