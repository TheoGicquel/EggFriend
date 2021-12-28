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

public class TamagotchiBasicControllerTests {
    private Tamagotchi tama;
    private TamagotchiBasicController controller;

    @Before
    public void init() {
        tama = new Tamagotchi();
        controller = new TamagotchiBasicController(tama);
    } 

    @Test
    public void TestGetHappiness() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void TestGetHunger() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void TestGetEnergy() {
        assertEquals(50, controller.getHappiness());
    }

    @Test
    public void TestGetHealth() {
        assertEquals(50, controller.getHappiness());
    }

    //

    @Test
    public void TestGetHappinessNaming() {
        assertEquals("Bonheur", controller.getHappinessNaming());
    }

    @Test
    public void TestGetHungerNaming() {
        assertEquals("Faim", controller.getHungerNaming());
    }

    @Test
    public void TestGetEnergyNaming() {
        assertEquals("Energie", controller.getEnergyNaming());
    }

    @Test
    public void TestGetHealthNaming() {
        assertEquals("Vie", controller.getHealthNaming());
    }


    @Test
    public void TestIsTamagotchiAlive() {
        assertEquals(true, controller.isTamagotchiAlive());
    }


}
