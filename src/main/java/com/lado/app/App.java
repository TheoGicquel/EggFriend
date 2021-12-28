package com.lado.app;
/**
 * @file App.java
 * @author Théo Gicquel
 * Point de lancement de l'application
 */
import com.lado.app.controller.TamagotchiController;
import com.lado.app.view.uipackage.startview.StartView;

public class App {


  public App() {
    TamagotchiController controller = new TamagotchiController();

    new StartView(controller);
   
  }
  public static void main(String[] args) {
    new App();
  }
}
