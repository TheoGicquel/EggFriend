package com.lado.app.Model.Tamagotchi;
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
