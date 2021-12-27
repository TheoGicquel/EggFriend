package com.lado.app.model.tamagotchi;
import static org.junit.Assert.*;

import org.junit.Test;

public class EvalTests {

    @Test
    public void killTest(){
      Tamagotchi tama = new Tamagotchi();
      tama.kill();
      assertEquals(false,tama.isAlive());
      assertEquals("Mort",tama.getMood());

    }
    
  
}
