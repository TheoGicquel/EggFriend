package com.lado.app.Model.GameManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

/**
 * @brief sauvegarde le Tamagotchi fourni en entrée
 */
public class GameSaver {
    Tamagotchi savetama;
    
    public GameSaver(){
        savetama = new Tamagotchi();

    }

    public int save(Tamagotchi tama)
    {
        savetama = tama;
        
        try {
            FileOutputStream fileOut =
            new FileOutputStream("tamagotchisaving.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(savetama);
            out.close();
            fileOut.close();
            //System.out.printf("game Saved");
            return 0;
        } catch (IOException i) {
            i.printStackTrace();
            return 1;
        }
    }
}
