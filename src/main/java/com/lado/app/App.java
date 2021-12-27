package com.lado.app;

import com.lado.app.Controller.TamagotchiController;
import com.lado.app.View.UIPackage.StartView.StartView;

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
