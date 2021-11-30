package com.lado.Tamagotchi;

import static org.junit.Assert.*;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

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
  public void testTamagotchiDefConstr() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Tamago", testTamagotchi.getName());
    assertEquals(true, testTamagotchi.getAlive());
    assertEquals(100, testTamagotchi.health.getVal());
    assertEquals(100, testTamagotchi.energy.getVal());
    assertEquals(100, testTamagotchi.hunger.getVal());
    assertEquals(100, testTamagotchi.cleanliness.getVal());
    assertEquals(100, testTamagotchi.happiness.getVal());
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
    assertEquals(0, testTamagotchi.health.getVal());
    assertEquals(false, testTamagotchi.getAlive());
  }

  @Test
  public void testSetHealth() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");

    testTamagotchi.setHealth(20);
    assertEquals(20, testTamagotchi.health.getVal());
  }

  @Test
  public void testHeal() {
    Tamagotchi testTamagotchi = new Tamagotchi("tama");
    testTamagotchi.setHealth(30);
    testTamagotchi.heal(12);
    assertEquals(42, testTamagotchi.health.getVal());

    testTamagotchi.heal(120);
    assertEquals(100, testTamagotchi.health.getVal());
  }

  @Test
  public void testHurt() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHealth(43);
    testTamagotchi.hurt(13);
    assertEquals(30, testTamagotchi.health.getVal());

    testTamagotchi.hurt(900);
    assertEquals(0, testTamagotchi.health.getVal());
    assertEquals(false, testTamagotchi.getAlive());
  }
}