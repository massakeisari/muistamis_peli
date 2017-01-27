package muistamispeli.labramuistipeli;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliTest {

	@Test
	public void test() {
		Peli p = new Peli();
		p.luoRuudut(20);
		assertEquals(40, p.getRuutujenMaara());
	}

}
