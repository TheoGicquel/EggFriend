package com.lado.app.view.uipackage.gameview;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class NeedBarTests {
    @Test
    public void constructorTest() {
        NeedBar needbar = new NeedBar(2);
        assertEquals(2, needbar.getValue()); 
    }
}
