package com.lado.app.Model.GameManager;

public class GameManager {

  protected String saveLocation = "../saveData/";
  public GameSaver saver;
  public GameLoader loader;
  public GameTimer timer;

  public GameManager() {
    saver = new GameSaver();
    loader = new GameLoader();
    timer = new GameTimer();
  }

  public float getTimeElapsed() {
    return timer.getTimeDifference();
}

}
