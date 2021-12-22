package com.lado.app.Model.Tamagotchi;
import org.junit.Test;
import static org.junit.Assert.*;



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
    public void reviveExpectedFailure()
    {
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHealth(0);
      testTamagotchi.setAlive(false);
      testTamagotchi.setHealth(100);
      assertEquals(false, testTamagotchi.getAlive());
    }
  
    @Test
    public void testSetHealth() {
      Tamagotchi testTamagotchi = new Tamagotchi();
  
      testTamagotchi.setHealth(20);
      assertEquals(20, testTamagotchi.getHealth());
    }
  
}
