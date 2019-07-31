package com.codecool.games.service;

import com.codecool.games.model.Genre;
import com.codecool.games.model.Questionnaire;
import com.codecool.games.model.ScreenFun;
import com.codecool.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    private Random random;

    public ScreenFun getRandomGame() {
        return gameRepository.getScreenFunsById(random.nextInt(17)+1);
    }

    public List<ScreenFun> getAllGames() {
        return gameRepository.findAll();
    }

    public ScreenFun getFilteredGame(Questionnaire questionnaire) {
        return gameRepository.getFirstByGenre(Genre.ACTION);
    }
}
