/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class RuutuTest {
    private Ruutu r1;
    private Ruutu r2;
    private Ruutu r3;
    
    public RuutuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r1 = new Ruutu(6, 6);
        r2 = new Ruutu(5, 5);
        r3 = new Ruutu(4, 4);
        r3.avaa();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void auki() {
        assertTrue(r3.onkoAuki());
    }
    
    @Test
    public void kiinniAlussa() {
        assertFalse(r1.onkoAuki());
    }
    
    @Test
    public void meneeKiinni() {
        r3.sulje();
        assertFalse(r3.onkoAuki());
    }
    
}
