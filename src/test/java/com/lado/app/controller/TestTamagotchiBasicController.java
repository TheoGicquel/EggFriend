package com.lado.app.controller;
/**
 * @file TamagothiControllerActionTests.java
 * @author Théo Gicquel
 * Tests des actions du controlleur liées aux boutons
 * Les boutons déclenchant l'apparition d'une fenêtre de dialogue sont ommis
 */
import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.lado.app.model.tamagotchi.Tamagotchi;

public class TestTamagotchiBasicController {
    private Tamagotchi tama;
    private TamagotchiBasicController controller;

    @Before
    public void testInit() {
        tama = new Tamagotchi();
        controller = new TamagotchiBasicController(tama);
    } 

    @Test
    public void testGetHappiness() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void testGetHunger() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void testGetEnergy() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void testGetHealth() {
        assertEquals(50, controller.getHappiness());
    }

    //

    @Test
    public void testGetHappinessNaming() {
        assertEquals("Bonheur", controller.getHappinessNaming());
    }

    @Test
    public void testGetHungerNaming() {
        assertEquals("Faim", controller.getHungerNaming());
    }

    @Test
    public void testGetEnergyNaming() {
        assertEquals("Energie", controller.getEnergyNaming());
    }

    @Test
    public void testGetHealthNaming() {
        assertEquals("Vie", controller.getHealthNaming());
    }


    @Test
    public void testIsTamagotchiAlive() {
        assertEquals(true, controller.isTamagotchiAlive());
    }


}
