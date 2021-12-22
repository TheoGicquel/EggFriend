package com.lado.app.Model.Tamagotchi;

import static org.junit.Assert.*;


/** 
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
**/
import org.junit.Test;

public class TamagotchiTest {





  @Test
  public void testTamagotchiDefConstr() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setDefaultStats();
    assertEquals("Tamago", testTamagotchi.getName());
    assertEquals(true, testTamagotchi.getAlive());
    assertEquals(50, testTamagotchi.getHealth());
    assertEquals(50, testTamagotchi.getEnergy());
    assertEquals(50, testTamagotchi.getHunger());
    assertEquals(50, testTamagotchi.getCleanliness());
    assertEquals(50, testTamagotchi.getHappiness());
  }

  @Test
  public void testDefaultGetName() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Tamago", testTamagotchi.getName());
  }

  @Test
  public void testSetName() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setName("tamatest");
    assertEquals("tamatest", testTamagotchi.getName());
  }
  


  @Test
  public void testGetMood(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("normal",testTamagotchi.getMood());
  }
  
  @Test
  public void testSetMood(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setMood("Joyeux");
    assertEquals("Joyeux", testTamagotchi.getMood());
  }


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
  
  @Test
  public void testHeal() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHealth(30);
    testTamagotchi.heal(12);
    assertEquals(42, testTamagotchi.getHealth());

    testTamagotchi.heal(120);
    assertEquals(100, testTamagotchi.getHealth());
  }

  @Test
  public void testHurt() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHealth(43);
    testTamagotchi.hurt(13);
    assertEquals(30, testTamagotchi.getHealth());

    testTamagotchi.hurt(900);
    assertEquals(0, testTamagotchi.getHealth());
    assertEquals(false, testTamagotchi.getAlive());
  }


  @Test
  public void getFavoriteFoodDefaultByIndex(){
    Tamagotchi foodtama = new Tamagotchi();
    assertEquals("N/A",foodtama.getFavoriteFood(0));
  }
  





}
