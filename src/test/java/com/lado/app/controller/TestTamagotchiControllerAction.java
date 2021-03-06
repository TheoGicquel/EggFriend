package com.lado.app.controller;
/**
 * @file TamagothiControllerActionTests.java
 * @author Théo Gicquel
 * Tests des actions du controlleur liées aux boutons
 * Les boutons déclenchant l'apparition d'une fenêtre de dialogue sont ommis
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.lado.app.model.tamagotchi.Tamagotchi;

public class TestTamagotchiControllerAction {
        

    @Test
    public void cleanActionTest() {
        Tamagotchi tama = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(tama);
        assertEquals(true, controller.isTamagotchiAlive());
        controller.cleanAction();
        assertEquals(90, controller.getCleanliness());
        assertEquals(45, controller.getHappiness());
    }


    @Test
    public void playActionTest() {
        Tamagotchi tama = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(tama);
        assertEquals(true, controller.isTamagotchiAlive());
        controller.playAction();
        assertEquals(90, controller.getHappiness());
        assertEquals(40, controller.getHunger());
    }
    

    @Test
    public void sleepActionTest() {
        Tamagotchi tama = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(tama);
        assertEquals(true, controller.isTamagotchiAlive());
        controller.playAction();
        assertEquals(30, controller.getEnergy());
        assertEquals(90, controller.getHappiness());
    }
}
