package com.lado.app.controller;
/**
 * @file TamagothiControllerTests.java
 * @author Théo Gicquel
 * Tests du controlleur affectant le Tamagotchi
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.lado.app.model.tamagotchi.Tamagotchi;
import org.junit.Test;

public class TamagotchiControllerTests {

    @Test
    public void ControllerEmptyConstructor() {
        TamagotchiController controller = new TamagotchiController();
        assertNotNull(controller);
    }

    @Test
    public void ControllerConstructor() {
        Tamagotchi model = new Tamagotchi();
         TamagotchiController controller =  new TamagotchiController(model);
        assertNotNull(controller);
    }


    
    @Test
    public void ControllerConstructorA() {
        Tamagotchi model = new Tamagotchi();
         TamagotchiController controller =  new TamagotchiController(model);
        assertEquals("Faim", controller.getHungerNaming());
    }

    @Test
    public void getterTests() {
        Tamagotchi model = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(model);
        int def= 50;
        assertEquals(def, controller.getHunger());
        assertEquals(def, controller.getCleanliness());
        assertEquals(def, controller.getEnergy());
        assertEquals(def, controller.getHappiness());
        assertEquals(def, controller.getHealth());
    }

}
