package com.lado.app.Controller;



import static org.junit.Assert.assertEquals;



import com.lado.app.Model.Tamagotchi.Tamagotchi;

import org.junit.Test;

public class TamagotchiControllerTests {

    @Test
    public void ControllerEmptyConstructor() {
        new TamagotchiController();
    }

    @Test
    public void ControllerConstructor() {
        Tamagotchi model = new Tamagotchi();
         new TamagotchiController(model);
        
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
