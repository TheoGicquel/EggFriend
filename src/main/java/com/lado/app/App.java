package com.lado.app;

import com.lado.app.Controller.TamagotchiController;
import com.lado.app.View.UIPackage.GameView.GameView;
import com.lado.app.View.UIPackage.StartView.StartView;

/**
 * Hello world!
 */
public class App {


  public GameView view;
  public TamagotchiController controller;


  public App() {
    TamagotchiController controller = new TamagotchiController();

    new StartView(controller);
   
  }
  public static void main(String[] args) {
    new App();
  }


  
}
