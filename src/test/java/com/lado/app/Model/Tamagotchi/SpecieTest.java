package com.lado.app.Model.Tamagotchi;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpecieTest {



    @Test
    public void getFavoriteFoods() {
        Specie specie = new Specie("cat");
        List<String> expected = new ArrayList<>();
        expected = specie.getFavoriteFoods();
        assertEquals(expected, specie.getFavoriteFoods());
    }




    @Test
    public void getFavoriteFoodDogByIndex(){
      Tamagotchi dogTama = new Tamagotchi();
      dogTama.setSpecie("dog");
      assertEquals("Croquettes",dogTama.getFood(0));
    }
  

    @Test
    public void getFavoriteFoodDogByIndexError(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setSpecie("Chien");
      assertEquals("",testTamagotchi.getFood(1));
    }

    @Test
    public void getFavoriteFoodCatByIndex(){
      Tamagotchi dogTama = new Tamagotchi();
      dogTama.setSpecie("cat");
      assertEquals("Poisson",dogTama.getFood(0));
    }
    
}
