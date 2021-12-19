package com.lado.Tamagotchi;
import static org.junit.Assert.*;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import org.junit.Test;

public class SpecieTest {

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
    public void getFavoriteFoodDogByIndex(){
      Tamagotchi dogTama = new Tamagotchi();
      dogTama.setSpecie("dog");
      assertEquals("Os",dogTama.getFood(1));
    }
  
    @Test
    public void getFavoriteFoodDogByIndexError(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setSpecie("cat");
      assertEquals("Poisson",testTamagotchi.getFood(1));
    }
    
}
