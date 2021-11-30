package com.lado.app.Model.saveData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import com.lado.app.Model.Tamagotchi.Tamagotchi;

public class GameSaver {

    Void savegame()
    {
        try (FileOutputStream fos = new FileOutputStream("object.dat");
     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

    // create a new user object
    Tamagotchi user = new Tamagotchi();

    // write object to file
    oos.writeObject(user);

} catch (IOException ex) {
    ex.printStackTrace();
}
        return null;
    }
    
}
