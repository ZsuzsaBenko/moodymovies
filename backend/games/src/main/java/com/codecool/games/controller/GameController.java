package com.codecool.games.controller;

import com.codecool.games.model.ScreenFun;
import com.codecool.games.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/random")
    public ScreenFun getRandomGame() {
        return gameService.getRandomGame();
    }

    @GetMapping("/all")
    public List<ScreenFun> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping("/questionnaire")
    public List<ScreenFun> getFilteredGames() {
       return gameService.getFilteredGames();
    }
}
