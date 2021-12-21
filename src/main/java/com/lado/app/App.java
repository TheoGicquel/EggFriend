package com.lado.app;

import com.lado.app.Controller.GameController;
import com.lado.app.Controller.TamagotchiController;
import com.lado.app.Model.GameModel;
import com.lado.app.View.UIPackage.Legacy.GameView;
import com.lado.app.View.UIPackage.StartView.StartView;



/**
 * Hello world!
 */
public class App {

  public GameModel model;
  public GameView view;
  public GameController controller;


  public App() {
    model = new GameModel();
    view = new  GameView(model);
    controller = new GameController(model,view);
  }
  // App app = new App();
  public static void main(String[] args) {

    //App app = new App();
   // app.controller.start();

    // Tamagotchi mytama= new Tamagotchi();
    // mytama.setSpecie("sheep");
    //mytama.getName();
    //System.out.println(mytama.getBreed());


    TamagotchiController controller = new TamagotchiController();

    new StartView(controller);
    

  }


  
}
