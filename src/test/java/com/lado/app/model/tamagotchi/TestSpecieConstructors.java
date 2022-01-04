package com.lado.app.model.tamagotchi;
/**
 * @file TestSpeceConstructors.java
 * @author Théo Gicquel
 * Tests des fonctions liées a l'espèce du Tamagotchi
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSpecieConstructors {
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
      assertEquals("Croquettes", specie.getFavoriteFood(0));
    }

    @Test
    public void testgoat()
    {
      Specie specie = new Specie("goat");
      assertEquals("goat", specie.getName());
      assertEquals("Chèvre", specie.getText());
      assertEquals("Herbe", specie.getFavoriteFood(0));
      
    }

    @Test
    public void testChevre()
    {
      Specie specie = new Specie("Chèvre");
      assertEquals("goat", specie.getName());
      assertEquals("Chèvre", specie.getText());
      assertEquals("Herbe", specie.getFavoriteFood(0));
      
    }

    @Test
    public void testRobot()
    {
      Specie specie = new Specie("robot");
      assertEquals("robot", specie.getName());
      assertEquals("Robot", specie.getText());
      assertEquals("Ecrous", specie.getFavoriteFood(0));
    }

    @Test
    public void testUnknown()
    {
      Specie specie = new Specie("unknown");
      assertEquals("unknown", specie.getName());
      assertEquals("Inconnu", specie.getText());
      assertEquals("N/A", specie.getFavoriteFood(0));
    }

}
