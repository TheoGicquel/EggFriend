package com.lado.app.model.gamemanager;
/**
 * @file GameLoader.java
 * @author Corentin Quiniou
 * @author Théo Gicquel
 * Systéme chargement de partie du jeu
 * @see Serializable
 */
import java.io.*;
import com.lado.app.model.tamagotchi.Tamagotchi;

public class GameLoader {

    private Tamagotchi tamaload; 

    public boolean loadingSuccess()
    {
        /// la structure du try catch ferme automatiquement les flux utilisés
        try(
            FileInputStream fileIn = new FileInputStream("tamagotchisavedata.ser");
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

