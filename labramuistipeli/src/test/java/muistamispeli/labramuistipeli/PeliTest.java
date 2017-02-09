package muistamispeli.labramuistipeli;

import java.util.ArrayList;
import static org.junit.Assert.*;
import muistamispeli.labramuistipeli.Ruutu;

import org.junit.Test;

public class PeliTest {

    @Test
    public void test() {
        ArrayList<Ruutu> r = new ArrayList<>();
        Peli p = new Peli(r);
        p.luoRuudut(20);
        assertEquals(40, p.getRuutujenMaara());
    }

}
