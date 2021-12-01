package com.lado.app.Controller;

import com.lado.app.Model.*;
import com.lado.app.View.*;

public class GameController {

    private GameView gameView;
    public static GameModel gameModel;
    private GameListener gameListener;

    public GameController(GameModel model, GameView view) {
        GameController.gameModel = model;
        this.gameView = view;
        this.gameListener = new GameListener(GameController.gameModel,this.gameView);
        
    }

    public void start() {
        
    }

    public static void updateTama() {
        float elapsedTime = gameModel.gameManager.getTimeElapsed();
        gameModel.tamagotchi.depleteNeeds(elapsedTime);
    }

    


    
}