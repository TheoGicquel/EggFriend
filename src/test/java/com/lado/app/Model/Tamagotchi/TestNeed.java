package com.lado.app.model.tamagotchi;
/**
 * @file NeedTest.java
 * @author Théo Gicquel
 * Tests des besoins du Tamagotchi
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNeed {

   


    @Test
    public void testneedDefaultConstructor()
    {
        Need testNeed = new Need();
        assertEquals(100,testNeed.getVal());
        assertEquals("unknown",testNeed.getName());
        assertEquals("descriptor",testNeed.getDescriptor());
        assertEquals(false,testNeed.isCritical());
    }

    @Test
    public void testneedFullConstructor(){
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals(32,testNeed.getVal());
        assertEquals("Boire",testNeed.getName());
        assertEquals("soif",testNeed.getDescriptor());
    }

    @Test
    public void testneedGetName(){
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals("Boire", testnNeed.getName());
    }

    @Test
    public void testneedSetValNormal()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(55);
        assertEquals(55, testnNeed.getVal());
    }

    @Test
    public void testneedSetValUnderflowAttempt()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(-25);
        assertEquals(0, testnNeed.getVal());
    }

    @Test
    public void testneedSetValOverflowAttempt()
    {
        Need testnNeed = new Need("Boire","soif",32, 0.2f);
        testnNeed.setVal(125);
        assertEquals(100, testnNeed.getVal());
        
    }

    @Test
    public void testneedGetCritical()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        assertEquals(false, testNeed.isCritical());
    }

    @Test
    public void testneedSetCritical()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        testNeed.setCritical(true);
        assertEquals(true, testNeed.isCritical());

        testNeed.setCritical(false);
        assertEquals(false, testNeed.isCritical());
        
    }

    @Test
    public void testneedSetName()
    {
        Need testNeed = new Need("Boire","soif",32, 0.2f);
        testNeed.setName("Aglouglou");
        assertEquals("Aglouglou", testNeed.getName());
    }

    @Test
    public void testgetFactorByDefaultConstructor()
    {
        Need testneed = new Need();
        assertEquals(0.01f, testneed.getFactor(),0.01f);
    }


    @Test
    public void testgetFactorByConstructor()
    {
        Need testNeed = new Need("Boire","soif",32, 0.1337f);
        assertEquals(0.1337f, testNeed.getFactor(),0.0001f);
    }

    @Test
    public void testsetFactor()
    {
        Need testNeed = new Need();
        testNeed.setFactor(0.404f);
        assertEquals(0.404f, testNeed.getFactor(),0.0001f);
    }

    @Test
    public void testneedCalcDepletion()
    {
        Need testNeed = new Need("Boire","soif",50, 0.05f);
        testNeed.calcDepletion(60);
        assertEquals(47, testNeed.getVal());
    }

    @Test
    public void testneedCalcDepletionTwoMinutes()
    {
        Need testNeed = new Need("Boire","soif",50, 0.05f);
        testNeed.calcDepletion(120);
        assertEquals(44, testNeed.getVal());
    }


    
    
}
