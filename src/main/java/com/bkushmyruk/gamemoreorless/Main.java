package com.bkushmyruk.gamemoreorless;

import com.bkushmyruk.gamemoreorless.controller.GameController;
import com.bkushmyruk.gamemoreorless.model.GameService;
import com.bkushmyruk.gamemoreorless.view.GameView;

public class Main {
    public static void main(String[] args) {
        GameView gameView =new GameView();
        GameService gameService = new GameService();
        GameController gameController = new GameController(gameService, gameView);

        gameController.run();
    }
}
