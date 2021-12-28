package com.lado.app.model.tamagotchi;
/**
 * @file TestNeedInteractions.java
 * @author Théo Gicquel
 * Tests d'interaction des besoins du Tamagotchi
 * Plus précisément, la baisse des besoins est testée
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNeedInteractions {

    @Test
    /**
     * Teste la baisse des besoins pour un écoulement de temps 
     * de 1 minute et 1 seconde (61000 millisecondes)
     */
    public void depleteNeedTest()
    {
        Tamagotchi tama = new Tamagotchi();
        tama.setModifiedTime(0);
        tama.depleteNeeds(61000);
        assertEquals(46, tama.getHunger(),1);
    }    
}
