package com.codecool.anime.service;

import com.codecool.anime.model.Questionnaire;
import com.codecool.anime.model.ScreenFun;
import com.codecool.anime.repository.AnimeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class AnimeService {

    private Random random = new Random();

    private AnimeRepository repository;

    @Autowired
    public AnimeService(AnimeRepository repository) {
        this.repository = repository;
    }

    public List<ScreenFun> getAll() {
        return repository.getAllByOrderByTitle();
    }

    public ScreenFun getOneRandom() {
        List<ScreenFun> animes = repository.getAllByOrderByTitle();
        return animes.get(random.nextInt(animes.size()));
    }

    public ScreenFun getOneBasedOnQuestionnaire(Questionnaire questionnaire) {


        return null;
    }
}
