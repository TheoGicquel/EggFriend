package com.lado.app;

import com.lado.app.Controller.GameController;
import com.lado.app.Model.GameModel;

import com.lado.app.View.GameView;



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

  public static void main(String[] args) {
    App app = new App();
    app.controller.start();



  }
}
