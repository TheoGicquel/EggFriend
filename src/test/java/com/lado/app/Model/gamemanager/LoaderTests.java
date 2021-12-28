package com.lado.app.model.gamemanager;
/**
 * @file LoaderTests.java
 * @author Théo Gicquel
 * Tests du chargment de données de sauvegarde
 * @deprecated
 * Cause un écrasement de données de sauvegarde qui peuvent être utilisées par le projet
 */
/** 
import static org.junit.Assert.*;
import com.lado.app.model.tamagotchi.Tamagotchi;
import org.junit.Test;
public class LoaderTests {

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