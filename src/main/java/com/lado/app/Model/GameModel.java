package com.lado.app.Model;
import com.lado.app.Model.GameManager.GameManager;
import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class GameModel {

    public Tamagotchi tamagotchi;
    
    public GameManager gameManager;
    

    public GameModel() {
        GameManager gameManager = new GameManager(tamagotchi);
        tamagotchi = new Tamagotchi();

    }
}
