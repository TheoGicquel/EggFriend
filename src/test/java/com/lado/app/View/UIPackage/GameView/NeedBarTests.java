package com.lado.app.View.UIPackage.GameView;


import static org.junit.Assert.assertEquals;



import com.lado.app.Model.Tamagotchi.Tamagotchi;

import org.junit.Test;


public class NeedBarTests {
    @Test
    public void constructorTest() {
        NeedBar needbar = new NeedBar(2);
        assertEquals(2, needbar.getValue()); 
    }
}
