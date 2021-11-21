
package com.lado.app.Tamagotchi;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;




public class TamagotchiTest
{
/* *
    @Before
    public void createTamagotchiInstance() {
        Tamagotchi testTamagotchi = new Tamagotchi("iamtest");
    }
*/
    @Test
    public void testTamagotchiConstructor() {
        try {
            new Tamagotchi("tama");
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testGetName() {
        Tamagotchi testTamagotchi = new Tamagotchi("tama");
        assertEquals("tama", testTamagotchi.getName());



    }
}
