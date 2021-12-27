package com.lado.app.model.gamemanager;

import com.lado.app.model.tamagotchi.Tamagotchi;

public class GameManager {

  protected String saveLocation = "../saveData/";
  public GameSaver saver;
  public GameLoader loader;
  public GameTimer timer;

  public GameManager(Tamagotchi tama) {
    saver = new GameSaver();
    loader = new GameLoader();
    timer = new GameTimer();
  }

  public float getTimeElapsed() {
    return timer.getTimeDifference();
}

}


