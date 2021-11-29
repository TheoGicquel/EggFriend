package com.lado.app;

import com.lado.app.Controller.GameController;
import com.lado.app.Model.GameModel;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.View.GameView;
import com.lado.app.View.UIPackage.*;

import javax.swing.JFrame;

/**
 * Hello world!
 */
public class App {


  public App() {}

  public static void main(String[] args) {
    


    GameModel model = new GameModel();
    GameView view = new  GameView(model);
    GameController controller = new GameController(model,view);


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

    System.out.print("Hello World!");
 
  }
}
