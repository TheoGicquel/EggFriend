package com.lado.app.Model.Tamagotchi;
import static org.junit.Assert.*;
import org.junit.Test;

public class SpecieConstructors {
    @Test
    public void testSetBreed(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setSpecie("dog");
      assertEquals("dog", testTamagotchi.getSpecie());
    }
  
  
    @Test
    public void testDefaultBreed(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      assertEquals("unknown", testTamagotchi.getSpecie());
    }


    @Test
    public void testCat(){
      Specie specie = new Specie("cat");
      assertEquals("cat", specie.getName());
      assertEquals("Chat", specie.getText());
      assertEquals("Poisson", specie.getFavoriteFood(0));
    }

    @Test
    public void testDog()
    {
      Specie specie = new Specie("dog");
      assertEquals("dog", specie.getName());
      assertEquals("Chien", specie.getText());
      assertEquals("Os", specie.getFavoriteFood(0));
    }

    @Test
    public void testSheep()
    {
      Specie specie = new Specie("sheep");
      assertEquals("sheep", specie.getName());
      assertEquals("Mouton", specie.getText());
      assertEquals("Herbe", specie.getFavoriteFood(0));
    }

    @Test
    public void testRobot()
    {
      Specie specie = new Specie("robot");
      assertEquals("robot", specie.getName());
      assertEquals("Robot", specie.getText());
      assertEquals("Vis", specie.getFavoriteFood(0));
    }

    @Test
    public void testUnknown()
    {
      Specie specie = new Specie("unknown");
      assertEquals("unknown", specie.getName());
      assertEquals("Inconnu", specie.getText());
      assertEquals("Nourriture", specie.getFavoriteFood(0));
    }

}
