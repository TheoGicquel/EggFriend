package com.lado.app.Controller;



import static org.junit.Assert.assertEquals;

import javax.swing.JFrame;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

import org.junit.Test;

public class TamagotchiControllerTests {

    @Test
    public void ControllerEmptyConstructor() {
        TamagotchiController controller = new TamagotchiController();
    }

    @Test
    public void ControllerConstructor() {
        Tamagotchi model = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(model);
        
    }

    @Test
    public void getterTests() {
        Tamagotchi model = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(model);
        int def= 50;
        assertEquals(def, model.getHunger());
        assertEquals(def, model.getCleanliness());
        assertEquals(def, model.getEnergy());
        assertEquals(def, model.getHappiness());
        assertEquals(def, model.getHealth());

        
    }




    
    
   // Cause interrution
    /** 
    @Test
    public void newGameTest() {
        TamagotchiController controller = new TamagotchiController();
        JFrame frame = new JFrame();
        controller.newGame(frame);
    }
    */





    
}
