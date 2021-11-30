package com.lado.app;

import com.lado.app.Controller.GameController;
import com.lado.app.Model.GameModel;

import com.lado.app.View.GameView;



/**
 * Hello world!
 */
public class App {


  public App() {}

  public static void main(String[] args) {
    


    GameModel model = new GameModel();
    GameView view = new  GameView(model);
    GameController controller = new GameController(model,view);
    controller.start();

    /**
     * Lancer une fenetre permettant de consulter les infos
     * sur le jeu et le tamagotchi
     */
    /** 
    if (debug.enabled) {
      DebugFrame debugWindow = new DebugFrame();
      debugWindow.loadTama(tama);
    }
    */


  }
}
