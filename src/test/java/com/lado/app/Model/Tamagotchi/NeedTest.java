
package com.lado.app.Model.Tamagotchi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class NeedTest {

   


    @Test
    public void needDefaultConstructor()
    {
        Need testNeed = new Need();
        assertEquals(100,testNeed.getVal());
        assertEquals("unknown",testNeed.getName());
        assertEquals("descriptor",testNeed.getDescriptor());
        assertEquals(false,testNeed.isCritical());
    }

    @Test
    public void needFullConstructor(){
       Need testNeed = new Need("Boire","soif",32, 0.2f);

    }

    @Test
    public void needGetName(){
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals("Boire", testnNeed.getName());
    }

    @Test
    public void needSetValNormal()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(55);
        assertEquals(55, testnNeed.getVal());
    }

    
    
}
