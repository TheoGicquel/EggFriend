package com.lado.app.model.gamemanager;
import java.io.*;

import com.lado.app.model.tamagotchi.Tamagotchi;



public class GameLoader {

    private Tamagotchi tamaload; 

    public boolean loadingSuccess()
    {
        
        try(
            FileInputStream fileIn = new FileInputStream("tamagotchisaving.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
        ){
            tamaload = (Tamagotchi) in.readObject();
            return true;
           
         } catch (IOException i)
         {
              return false;
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }


    public Tamagotchi loadTamagotchi()
    {
        return tamaload;
    }
}

