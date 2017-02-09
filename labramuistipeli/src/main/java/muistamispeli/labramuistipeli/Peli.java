package muistamispeli.labramuistipeli;

import java.util.ArrayList;
import java.util.List;

public class Peli {

    private List<Ruutu> ruudut;

    public Peli(ArrayList<Ruutu> ruudut) {
        this.ruudut = ruudut;
    }

    public void luoRuudut(int montako) {
        int apu = 0;
        while (apu < montako) {
            for (int i = 0; i < 2; i++) {
                Ruutu r = new Ruutu(apu);
                ruudut.add(r);
            }
            apu++;
        }
    }

    public int getRuutujenMaara() {
        return this.ruudut.size();
    }
}
