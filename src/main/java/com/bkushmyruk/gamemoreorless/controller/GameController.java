package com.bkushmyruk.gamemoreorless.controller;

import com.bkushmyruk.gamemoreorless.model.GameService;
import com.bkushmyruk.gamemoreorless.model.GameValidator;
import com.bkushmyruk.gamemoreorless.util.MessageConstants;
import com.bkushmyruk.gamemoreorless.view.GameView;
import com.bkushmyruk.gamemoreorless.view.View;

public class GameController {
    private GameService gameService;
    private GameView gameView;

    public GameController(GameService gameService, GameView gameView) {
        this.gameService = gameService;
        this.gameView = gameView;
    }

    public void run() {
        int[] limits = gameView.startGame();
        GameView gameView = new GameView();
        GameValidator gameValidator = new GameValidator();
        while (!gameValidator.validationLimits(limits[0], limits[1])) {
            View.printMessage(MessageConstants.WRONG_INPUT_DATA_MESSAGE);
            limits = gameView.startGame();
        }

        int[] history = gameService.processGame(limits[0], limits[1]);
        gameView.finishGame(history);
    }
}

