package com.lado.app.Model;
import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class GameModel {

    public Tamagotchi tamagotchi;
    public DebugMode debug;
    

    public GameModel() {
        tamagotchi = new Tamagotchi();
        debug = new DebugMode();
    }
}
