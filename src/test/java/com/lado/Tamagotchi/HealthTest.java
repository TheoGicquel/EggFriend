package com.lado.Tamagotchi;
import org.junit.Test;
import static org.junit.Assert.*;

import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class HealthTest {
    @Test
    public void testGetAlive(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      assertEquals(true,testTamagotchi.getAlive());
    }
    
    @Test
    public void testSetAlive(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setAlive(false);
      assertEquals(false, testTamagotchi.getAlive());
    }
    
    @Test
    public void testAliveHealth() {
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHealth(0);
      assertEquals(0, testTamagotchi.getHealth());
      assertEquals(false, testTamagotchi.getAlive());
    }
  
    @Test
    public void testSetHealth() {
      Tamagotchi testTamagotchi = new Tamagotchi();
  
      testTamagotchi.setHealth(20);
      assertEquals(20, testTamagotchi.getHealth());
    }
  
}
