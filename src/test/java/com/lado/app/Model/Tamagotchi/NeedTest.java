package com.lado.app.model.tamagotchi;
/**
 * @file NeedTest.java
 * @author Théo Gicquel
 * Tests des besoins du Tamagotchi
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class NeedTest {

   


    @Test
    public void needDefaultConstructor()
    {
        Need testNeed = new Need();
        assertEquals(100,testNeed.getVal());
        assertEquals("unknown",testNeed.getName());
        assertEquals("descriptor",testNeed.getDescriptor());
        assertEquals(false,testNeed.isCritical());
    }

    @Test
    public void needFullConstructor(){
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals(32,testNeed.getVal());
        assertEquals("Boire",testNeed.getName());
        assertEquals("soif",testNeed.getDescriptor());
    }

    @Test
    public void needGetName(){
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals("Boire", testnNeed.getName());
    }

    @Test
    public void needSetValNormal()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(55);
        assertEquals(55, testnNeed.getVal());
    }

    @Test
    public void needSetValUnderflowAttempt()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(-25);
        assertEquals(0, testnNeed.getVal());
    }

    @Test
    public void needSetValOverflowAttempt()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(125);
        assertEquals(100, testnNeed.getVal());
        
    }

    @Test
    public void needGetCritical()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals(false, testNeed.isCritical());
    }

    @Test
    public void needSetCritical()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        testNeed.setCritical(true);
        assertEquals(true, testNeed.isCritical());

        testNeed.setCritical(false);
        assertEquals(false, testNeed.isCritical());
        
    }

    @Test
    public void needSetName()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        testNeed.setName("Aglouglou");
        assertEquals("Aglouglou", testNeed.getName());
    }

    @Test
    public void getFactorByDefaultConstructor()
    {
        Need testneed = new Need();
        assertEquals(0.01f, testneed.getFactor(),0.01f);
    }


    @Test
    public void getFactorByConstructor()
    {
        Need testNeed = new Need("Boire","soif",32, 0.1337f);
        assertEquals(0.1337f, testNeed.getFactor(),0.0001f);
    }

    @Test
    public void setFactor()
    {
        Need testNeed = new Need();
        testNeed.setFactor(0.404f);
        assertEquals(0.404f, testNeed.getFactor(),0.0001f);
    }

    @Test
    public void needCalcDepletion()
    {
        Need testNeed = new Need("Boire","soif",50, 0.05f);
        testNeed.calcDepletion(60);
        assertEquals(47, testNeed.getVal());
    }

    @Test
    public void needCalcDepletionTwoMinutes()
    {
        Need testNeed = new Need("Boire","soif",50, 0.05f);
        testNeed.calcDepletion(120);
        assertEquals(44, testNeed.getVal());
    }


    
    
}
