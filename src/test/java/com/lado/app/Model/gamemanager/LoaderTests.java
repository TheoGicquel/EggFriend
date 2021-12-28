package com.lado.app.model.gamemanager;
/**
 * @file LoaderTests.java
 * @author Theo Gicquel
 * Tests du chargment de données de sauvegarde
 */
/** 
import static org.junit.Assert.*;
import com.lado.app.model.tamagotchi.Tamagotchi;
import org.junit.Test;
public class LoaderTests {

    /// Ces tests entrent en conflit avec les données sauvegardées localement
    

    @Test
    public void LoaderTestNoSaveData(){
        GameLoader loader = new GameLoader();
        assertEquals(false,loader.loadingSuccess());
    }

    @Test
    public void LoaderTestWithSaveData(){
        Tamagotchi testTama = new Tamagotchi();
        GameSaver saver = new GameSaver();
        saver.save(testTama);
        GameLoader loader = new GameLoader();
        assertEquals(true,loader.loadingSuccess());
    }

   

}
 **/