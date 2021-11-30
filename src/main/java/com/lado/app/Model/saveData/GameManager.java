package com.lado.app.Model.saveData;

public class GameManager {

  protected String saveLocation = "../saveData/";
  public GameSaver saver;
  public GameLoader loader;

  public GameManager() {
    saver = new GameSaver();
    loader = new GameLoader();
  }

}
