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
    private SeriesRepository seriesRepository;
    @Autowired
    private SeriesService seriesService;



    @GetMapping("/all")
    public List<ScreenFun> getAllScreenFun() {
        return seriesService.getALl();
    }

    @GetMapping("/order")
    public List<ScreenFun> getOrderByRating() {
        return seriesRepository.findByOrderByRatingAsc();
    }


    @GetMapping("/random")
    public ScreenFun getRandom() {
        return seriesService.getRandomScreenFun();
    }

    @GetMapping("/questionnaire")
    public List<ScreenFun> getPersonal(@RequestBody Questionnaire questionnaire) {
//        List<ScreenFun> chooseFor = seriesRepository.findAll();
//        if (questionnaire.getMasochist() == 1){
//            chooseFor = seriesRepository.findByOrderByRatingAsc();
//            return chooseFor.subList(0, 2);
//        }
//        if(questionnaire.getMood() == Mood.BE_SCARED || questionnaire.getMood() == Mood.BE_THRILLED){
//        }
//
//        return chooseFor;
        if (questionnaire.getMood() == null) {
            return seriesService.collectTheLaugh();
        }
        return seriesService.collectTheCry();
    }

    @GetMapping("/test")
    public List<ScreenFun> getTest() {
        List<ScreenFun> series = seriesRepository.findByOrderByRatingAsc();
        return seriesService.getSecondHalfOfTheList(series);

    }

    @GetMapping("/adv")
    public List<ScreenFun> getCries() {
        return seriesService.collectTheScaredThrilled();
    }
}
