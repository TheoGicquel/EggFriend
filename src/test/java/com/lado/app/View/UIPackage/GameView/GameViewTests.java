package com.lado.app.View.UIPackage.GameView;



import com.lado.app.Controller.TamagotchiController;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameViewTests {

    @Test
    public void viewEmptyConstructor() {
       GameView view = new GameView();
    }




    @Test
    public void viewConstructorNewGame() {
        TamagotchiController testController = new TamagotchiController();
        GameView testGameView = new GameView(testController,true);
        assertEquals("TamagotchiGame - Nouvelle Partie", testGameView.frame.getTitle());

    }


    @Test
    public void viewConstructorLoadedGame() {
        TamagotchiController testController = new TamagotchiController();
        GameView testGameView = new GameView(testController,false);
        assertEquals("TamagotchiGame - Charger Partie", testGameView.frame.getTitle());

    }




    
}
