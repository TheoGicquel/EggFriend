package com.lado.app.Model.GameManager;
import java.io.*;

import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class GameLoader {

    public Tamagotchi tamaload; 
    
    public GameLoader() {
        tamaload = null;
        try {
           FileInputStream fileIn = new FileInputStream("tamagotchisaving.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           tamaload = (Tamagotchi) in.readObject();
           in.close();
           fileIn.close();
        } catch (IOException i) {
           i.printStackTrace();
           return;
        } catch (ClassNotFoundException c) {
           System.out.println("Tamagotchi save not found");
           c.printStackTrace();
           return;
        }
    }
    public Tamagotchi loadTamagotchi()
    {
        return tamaload;
    }
}

