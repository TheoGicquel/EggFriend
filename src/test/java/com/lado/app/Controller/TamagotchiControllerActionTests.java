package com.lado.app.controller;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


import com.lado.app.model.tamagotchi.Tamagotchi;

public class TamagotchiControllerActionTests {
        

    @Test
    public void cleanActionTest() {
        Tamagotchi tama = new Tamagotchi();
        TamagotchiController controller = new TamagotchiController(tama);
        assertEquals(true, controller.isTamagotchiAlive());
        controller.cleanAction();
        assertEquals(90, controller.getCleanliness());
        assertEquals(45, controller.getHapiness());
    }
    
}
