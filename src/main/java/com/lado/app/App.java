package com.lado.app;

import com.lado.app.controller.TamagotchiController;
import com.lado.app.view.uipackage.startview.StartView;

/**
 * Hello world!
 */
public class App {


  public App() {
    TamagotchiController controller = new TamagotchiController();

    new StartView(controller);
   
  }
  public static void main(String[] args) {
    new App();
  }


  
}
