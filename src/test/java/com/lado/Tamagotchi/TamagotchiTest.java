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
}
