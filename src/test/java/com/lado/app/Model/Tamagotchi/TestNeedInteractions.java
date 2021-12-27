package com.lado.app.model.tamagotchi;

import org.junit.Test;
import static org.junit.Assert.*;



public class TestNeedInteractions {

   


    @Test
    public void depleteNeedTest()
    {
        Tamagotchi tama = new Tamagotchi();
        tama.setModifiedTime(0);
        tama.depleteNeeds(61000);
        assertEquals(46, tama.getHunger(),1);
    }


    
    
}
