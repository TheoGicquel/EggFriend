package com.lado.app.Controller;

import com.lado.app.Model.*;
import com.lado.app.View.*;

public class GameController {

    public static GameView gameView;
    public static GameModel gameModel;
    public static GameListener gameListener;

    public GameController(GameModel model, GameView view) {
        GameController.gameModel = model;
        GameController.gameView = view;
      
        GameController.gameListener = new GameListener(GameController.gameModel,GameController.gameView);
        
    }

    public void start() {
        gameListener.start();
    }

    public static void updateTama() {
        float elapsedTime = gameModel.gameManager.getTimeElapsed();
        gameModel.tamagotchi.depleteNeeds(elapsedTime);
        
    }

    public static void degradeTama(){
        gameModel.tamagotchi.hurt(10);
    }

    public static void updateView() {
        gameView.updateView();
    }

    


    
}