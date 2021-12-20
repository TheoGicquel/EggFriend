package com.lado.app.Model.GameManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

public class GameSaver {

    public GameSaver(Tamagotchi tama){
        Tamagotchi savetama = new Tamagotchi();
        savetama = tama;
        
        try {
            FileOutputStream fileOut =
            new FileOutputStream("tamagotchisaving.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(savetama);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in tamagotchisaving.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
