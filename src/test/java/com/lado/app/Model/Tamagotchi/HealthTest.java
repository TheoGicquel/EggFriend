package com.lado.app.model.tamagotchi;
/**
 * @file HealthTest.java
 * @author Théo Gicquel
 * Tests de la vie et de la mort du tamagotchi
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class HealthTest {
    @Test
    public void testisAlive(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      assertEquals(true,testTamagotchi.isAlive());
    }
    
    @Test
    public void testSetAlive(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setAlive(false);
      assertEquals(false, testTamagotchi.isAlive());
    }
    
    @Test
    public void reviveExpectedFailure()
    {
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHealth(0);
      testTamagotchi.setAlive(false);
      testTamagotchi.setHealth(100);
      assertEquals(false, testTamagotchi.isAlive());
    }
  
    @Test
    public void testSetHealth() {
      Tamagotchi testTamagotchi = new Tamagotchi();
  
      testTamagotchi.setHealth(20);
      assertEquals(20, testTamagotchi.getHealth());
    }


    @Test
    public void killTest(){
      Tamagotchi tama = new Tamagotchi();
      tama.kill();
      assertEquals(false,tama.isAlive());
      assertEquals("Mort",tama.getMood());

    }
  
}
