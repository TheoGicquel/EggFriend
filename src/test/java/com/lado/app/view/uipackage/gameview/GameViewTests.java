package com.lado.app.view.uipackage.gameview;
/**
 * @file GameViewTests.java
 * @author Théo Gicquel
 * Tests de l'interface graphique principale
 */
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameViewTests {

    @Test
    public void viewEmptyConstructor() {
       GameView view =  new GameView();
        assertNotNull(view);
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
