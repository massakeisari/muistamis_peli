
package muistamispeli.labramuistipeli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TarkastajaTest {
    
    Tarkastaja t;
    Ruutu r1;
    Ruutu r2;
    Ruutu r3;
    
    @Before
    public void setUp() {
        t = new Tarkastaja();
        r1 = new Ruutu(5);
        r2 = new Ruutu(10);
        r3 = new Ruutu(5);
    }
    
    @Test
    public void onkoAuki() {
        r1.avaa();
        assertEquals(true, t.onkoAuki(r1));
    }
    
    @Test
    public void onkoKiinni() {
        assertEquals(false, t.onkoAuki(r1));
    }
    
    @Test
    public void tunnistaaParin() {
        assertEquals(true, t.vertaa(r1, r3));
    }
    
    @Test
    public void hylkaaEriparit() {
        assertEquals(false, t.vertaa(r1, r2));
    }
    
    @Test
    public void sulkeeEriparit() {
        r1.avaa();
        r2.avaa();
        t.tarkastaPari(r1, r2);
        assertEquals(false, r1.onkoAuki());
        assertEquals(false, r2.onkoAuki());
    }
    
    @Test
    public void jattaaParitAuki() {
        r1.avaa();
        r3.avaa();
        t.tarkastaPari(r1, r3);
        assertEquals(true, r1.onkoAuki());
        assertEquals(true, r3.onkoAuki());
    }
    
}
