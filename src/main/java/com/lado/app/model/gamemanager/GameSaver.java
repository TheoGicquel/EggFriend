package com.lado.app.model.gamemanager;
/**
 * @file GameSaver.java
 * @author Corentin Quiniou
 * @author Théo Gicquel
 * Systéme de sauvegarde du jeu
 * @see Serializable
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.lado.app.model.tamagotchi.Tamagotchi;


public class GameSaver {
    Tamagotchi savetama;
    
    public GameSaver(){
        savetama = new Tamagotchi();

    }
    /**
     * @brief sauvegarde le Tamagotchi fourni en entrée
     */
    public int save(Tamagotchi tama)
    {
        savetama = tama;
        /// la structure du try catch ferme automatiquement les flux utilisés
        try(
            FileOutputStream fileOut = new FileOutputStream("tamagotchisavedata.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ){
            out.writeObject(savetama);
            return 0;
        } catch (IOException i) {
            i.printStackTrace();
            return 1;
        }
    }
}
