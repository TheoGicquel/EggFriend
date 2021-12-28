package com.lado.app.model.tamagotchi;
/**
 * @file TamagotchiSettersTest.java
 * @author Emilie Kermorvant 
 * Tests des setters de la classe Tamagotchi
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TamagotchiSettersTest {
    @Test
    public void testSetEnergy(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setEnergy(30);
      assertEquals(30, testTamagotchi.getEnergy());
    }
    
    @Test
    public void testSetHunger(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHunger(60);
      assertEquals(60, testTamagotchi.getHunger());
    }
    
    @Test
    public void testSetCleanliness(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setCleanliness(40);
      assertEquals(40, testTamagotchi.getCleanliness());
    }
    
    @Test
    public void testSetHappiness(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHappiness(50);
      assertEquals(50,testTamagotchi.getHappiness());
    }
    
}
