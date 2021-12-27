package com.lado.app.Model.GameManager;
import java.io.*;

import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class GameLoader {

    public Tamagotchi tamaload; 
    
    public GameLoader() {
        

    }

    public boolean loadingSuccess()
    {
        try {
            FileInputStream fileIn = new FileInputStream("tamagotchisaving.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tamaload = (Tamagotchi) in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException i) {


            return false;
         } catch (ClassNotFoundException c) {

            return false;
         }
        return true;
    }


    public Tamagotchi loadTamagotchi()
    {
        return tamaload;
    }
}

