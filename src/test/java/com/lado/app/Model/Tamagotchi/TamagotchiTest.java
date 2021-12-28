package com.lado.app.model.tamagotchi;
/**
 * @file Tamagotchi.java
 * @author Théo Gicquel 
 * Test de la classe Tamagotchi
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TamagotchiTest {

  @Test
  public void testTamagotchiDefConstr() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setDefaultStats();
    assertEquals("Tamago", testTamagotchi.getName());
    assertEquals(true, testTamagotchi.isAlive());
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
  public void testHeal() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHealth(30);
    testTamagotchi.heal(12);
    assertEquals(42, testTamagotchi.getHealth());

    testTamagotchi.heal(120);
    assertEquals(100, testTamagotchi.getHealth());
  }

  @Test
  public void testEvalHealthBelow(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHunger(5);
    testTamagotchi.evalHealth();
    assertEquals(48, testTamagotchi.getHealth());
  }

  @Test
  public void testHurt() {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setHealth(43);
    testTamagotchi.hurt(13);
    assertEquals(30, testTamagotchi.getHealth());
  }


  @Test
  public void testHurtUnderFlow()
  {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.hurt(900);
    assertEquals(0, testTamagotchi.getHealth());
    assertEquals(false, testTamagotchi.isAlive());
  }


  @Test
  public void getFavoriteFoodDefaultByIndex(){
    Tamagotchi foodtama = new Tamagotchi();
    assertEquals("N/A",foodtama.getFavoriteFood(0));
  }
  
  @Test
  public void testGetHealthName(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Vie",testTamagotchi.getHealthName());
  }

  @Test
  public void testGetEnergyName(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Energie",testTamagotchi.getEnergyName());
  }

  @Test
  public void testGetHungerName(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Faim",testTamagotchi.getHungerName());
  }

  @Test
  public void testGetCleanlinessName(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Proprete",testTamagotchi.getCleanlinessName());
  }

  @Test
  public void testGetHappinessName(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Bonheur",testTamagotchi.getHappinessName());
  }


  @Test
  public void testGetModifiedTime()
  {
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals(0,testTamagotchi.getModifiedTime());
  }

  @Test
  public void testSetModifiedTime()
  {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setModifiedTime(5);
    assertEquals(5,testTamagotchi.getModifiedTime());
  }


  @Test
  public void testSetModifiedTimeNow()
  {
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.update();
    assertEquals(System.currentTimeMillis(),testTamagotchi.getModifiedTime(),100);
  }
}
