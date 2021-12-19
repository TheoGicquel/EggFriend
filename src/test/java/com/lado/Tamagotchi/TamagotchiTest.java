package com.lado.Tamagotchi;

import static org.junit.Assert.*;

import com.lado.app.Model.Tamagotchi.Cat;
import com.lado.app.Model.Tamagotchi.Dog;





import com.lado.app.Model.Tamagotchi.Tamagotchi;

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
    assertEquals("Tamago", testTamagotchi.getName());
    assertEquals(true, testTamagotchi.getAlive());
    assertEquals(100, testTamagotchi.getHealth());
    assertEquals(100, testTamagotchi.getEnergy());
    assertEquals(100, testTamagotchi.getHunger());
    assertEquals(100, testTamagotchi.getCleanliness());
    assertEquals(100, testTamagotchi.getHappiness());
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
  
  /** 
  @Test
  public void testGetBreedInheritance(){
    Tamagotchi testTamagotchi = new Cat();
    assertEquals("Chat",testTamagotchi.getBreed());
  }
  **/
  @Test
  public void testSetBreed(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    testTamagotchi.setBreed("Chien");
    assertEquals("Chien", testTamagotchi.getBreed());
  }


  @Test
  public void testDefaultBreed(){
    Tamagotchi testTamagotchi = new Tamagotchi();
    assertEquals("Inconnu", testTamagotchi.getBreed());
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
  

/** 

  @Test
  public void getFavoriteFoodDogByIndex(){
    Tamagotchi dogTama = new Dog();
    assertEquals("Os",dogTama.getFavoriteFood(0));
  }

  @Test
  public void getFavoriteFoodDogByIndexError(){
    Tamagotchi testTamagotchi = new Dog();
    assertEquals("N/A",testTamagotchi.getFavoriteFood(1));
  }

**/
}
