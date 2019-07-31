package com.codecool.games.controller;

import com.codecool.games.model.Questionnaire;
import com.codecool.games.model.ScreenFun;
import com.codecool.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/random")
    public ScreenFun getRandomGame() {
        return gameService.getRandomGame();
    }

    @GetMapping("/all")
    public List<ScreenFun> getAllGames() {
        return gameService.getAllGames();
    }

    /*TODO business logic */
    @PostMapping("/questionnaire")
    public ScreenFun getFilteredGames(@RequestBody Questionnaire questionnaire) {
       return gameService.getFilteredGame(questionnaire);
    }
}
