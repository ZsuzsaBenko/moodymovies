package com.codecool.games.service;

import com.codecool.games.model.Genre;
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
        return null;
    }

    public List<ScreenFun> getAllGames() {
        return gameRepository.findAll();
    }

    public List<ScreenFun> getFilteredGames() {
        return gameRepository.getScreenFunsByGenre(Genre.ACTION);
    }
}
