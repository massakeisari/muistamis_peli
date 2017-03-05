/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli;

import java.util.ArrayList;
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
public class TarkastajaTest {
    private Tarkastaja t;
    
    public TarkastajaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void tyhjaListaFalse() {
        ArrayList<Ruutu> ruudut = new ArrayList<>();
        Tarkastaja tk = new Tarkastaja(ruudut);
        assertFalse(tk.tarkasta());
    }
    
    @Test
    public void kaikkiEiAuki() {
        ArrayList<Ruutu> ruudut = new ArrayList<>();
        Ruutu r = new Ruutu(5, 5);
        r.avaa();
        Ruutu r2 = new Ruutu(6, 6);
        ruudut.add(r);
        ruudut.add(r2);
        
        Tarkastaja tk = new Tarkastaja(ruudut);
        assertFalse(tk.tarkasta());
    }
    
    @Test
    public void kaikkiAuki() {
        ArrayList<Ruutu> ruudut = new ArrayList<>();
        Ruutu r = new Ruutu(5, 5);
        r.avaa();
        Ruutu r2 = new Ruutu(6, 6);
        r2.avaa();
        ruudut.add(r);
        ruudut.add(r2);
        
        Tarkastaja tk = new Tarkastaja(ruudut);
        assertTrue(tk.tarkasta());
    }
}
