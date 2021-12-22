package com.lado.app;


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
  public TamagotchiController controller;


  public App() {
    TamagotchiController controller = new TamagotchiController();

    new StartView(controller);
   
  }
  // App app = new App();
  public static void main(String[] args) {

    //App app = new App();
   // app.controller.start();

    // Tamagotchi mytama= new Tamagotchi();
    // mytama.setSpecie("sheep");
    //mytama.getName();
    //System.out.println(mytama.getBreed());

    new App();
  
    

  }


  
}
