package com.lado.app.Model;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.Model.saveData.GameManager;


public class GameModel {

    public Tamagotchi tamagotchi;
    public DebugMode debug;
    public GameManager gameManager;
    

    public GameModel() {
        GameManager gameManager = new GameManager();
        tamagotchi = new Tamagotchi();

    }

}
