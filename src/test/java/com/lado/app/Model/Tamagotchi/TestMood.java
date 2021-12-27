package com.lado.app.model.tamagotchi;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestMood {
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
    public void testEvalMoodOkay(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.evalMood();
      assertEquals("Normal", testTamagotchi.getMood());
    }

    
    @Test
    public void testEvalMoodHungry(){
      Tamagotchi testTamagotchi = new Tamagotchi();
      testTamagotchi.setHunger(20);
      testTamagotchi.evalMood();
      assertEquals("Affamé", testTamagotchi.getMood());
    }


}
