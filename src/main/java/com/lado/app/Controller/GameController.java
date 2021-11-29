package com.lado.app.Controller;

import com.lado.app.Model.*;
import com.lado.app.View.*;

public class GameController {

    private GameView gameView;
    private GameModel gameModel;

    public GameController(GameModel model, GameView view) {
        this.gameModel = model;
        this.gameView = view;
    }


    
}