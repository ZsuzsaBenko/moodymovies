package com.codecool.anime.controller;

import com.codecool.anime.model.Questionnaire;
import com.codecool.anime.model.ScreenFun;
import com.codecool.anime.service.AnimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/anime")
public class AnimeController {

    private AnimeService service;

    @Autowired
    public AnimeController(AnimeService service){
        this.service = service;
    }

    @GetMapping("/all")
    public List<ScreenFun> getAll() {
        return service.getAll();
    }

    @GetMapping("/random")
    public ScreenFun getOneRandom() {
        return service.getOneRandom();
    }

    @PostMapping("/questionnaire")
    public ScreenFun getOneBasedOnQuestionnaire(@RequestBody Questionnaire questionnaire) {
        return service.getOneBasedOnQuestionnaire(questionnaire);
    }
}
