package com.lado.app.model.tamagotchi;
/**
 * @file SpecieTest.java
 * @author Théo Gicquel
 * Tests de la l'espece du Tamagotchi
 */
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestSpecie {

    @Test
    public void TestgetFavoriteFoods() {
        Specie specie = new Specie("cat");
        List<String> expected = new ArrayList<>();
        expected = specie.getFavoriteFoods();
        assertEquals(expected, specie.getFavoriteFoods());
    }




    @Test
    public void TestgetFavoriteFoodDogByIndex(){
      Tamagotchi dogTama = new Tamagotchi();
      dogTama.setSpecie("dog");
      assertEquals("Croquettes",dogTama.getFood(0));
    }
  

    @Test
    public void TestgetFavoriteFoodDogByIndexError(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setSpecie("Chien");
      assertEquals("",testTamagotchi.getFood(1));
    }

    @Test
    public void TestgetFavoriteFoodCatByIndex(){
      Tamagotchi dogTama = new Tamagotchi();
      dogTama.setSpecie("cat");
      assertEquals("Poisson",dogTama.getFood(0));
    }

    @Test
    public void TestgetTextTestCat(){
      Tamagotchi cat = new Tamagotchi();
      cat.setSpecie("cat");
      assertEquals("Chat",cat.getSpecieText());
    }

    @Test
    public void TestgetTextTestDog(){
      Tamagotchi cat = new Tamagotchi();
      cat.setSpecie("dog");
      assertEquals("Chien",cat.getSpecieText());
    }
    
}
