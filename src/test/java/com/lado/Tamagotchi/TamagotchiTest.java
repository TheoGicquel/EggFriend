package com.lado.Tamagotchi;

import static org.junit.Assert.*;

import com.lado.app.Tamagotchi.Tamagotchi;
/** 
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
**/
import org.junit.Test;

public class TamagotchiTest {

  /* *
    @Before
    public void createTamagotchiInstance() {
        Tamagotchi testTamagotchi = new Tamagotchi("iamtest");
    }
*/
  @Test
  public void testTamagotchiConstructor() {
    try {
      new Tamagotchi("tama");
    } catch (Exception e) {
      fail("Construction failed.");
    }
  }

  @Test
  public void testTamagotchiDefConstr()
  {
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Tamago", testTamagotchi.getName());
    assertEquals(true, testTamagotchi.getIsAlive());
    assertEquals(100, testTamagotchi.getHealth());
    assertEquals(100, testTamagotchi.getEnergy());
    assertEquals(100, testTamagotchi.getHunger());
    assertEquals(100, testTamagotchi.getCleanliness());
    assertEquals(100, testTamagotchi.getHappiness());
    

  }

  @Test
  public void testGetName() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    assertEquals("tama", testTamagotchi.getName());
  }

  @Test
  public void testSetName() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    testTamagotchi.setName("tamatest");
    assertEquals("tamatest", testTamagotchi.getName());
  }

  @Test
  public void testAliveHealth() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    testTamagotchi.setHealth(0);
    assertEquals(0, testTamagotchi.getHealth());
    assertEquals(false, testTamagotchi.getIsAlive());
    
  }

  @Test
  public void testSetHealth() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    
    testTamagotchi.setHealth(20);
    assertEquals(20, testTamagotchi.getHealth());
  }

  @Test
  public void testHeal() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    testTamagotchi.setHealth(30);
    testTamagotchi.heal(12);
    assertEquals(42, testTamagotchi.getHealth());
    

    testTamagotchi.heal(120);
    assertEquals(100, testTamagotchi.getHealth());
    
  }

  @Test
  public void testHurt() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    testTamagotchi.setHealth(42);
    testTamagotchi.hurt(12);
    assertEquals(30, testTamagotchi.getHealth());
     
    testTamagotchi.hurt(900);
    assertEquals(0, testTamagotchi.getHealth());
    assertEquals(false, testTamagotchi.getIsAlive());
    
  }


}
