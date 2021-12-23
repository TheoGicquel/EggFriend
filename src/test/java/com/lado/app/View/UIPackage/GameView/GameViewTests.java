package com.lado.app.View.UIPackage.GameView;




import org.junit.Test;


public class GameViewTests {

    @Test
    public void viewEmptyConstructor() {
       new GameView();

    }


    // Inutilisable car remplacement du titre par le nom du tamagotchi
    /** 
     
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
    */



    
}
