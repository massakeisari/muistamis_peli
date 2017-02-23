package muistamispeli.labramuistipeli;

import java.util.ArrayList;

public class Tarkastaja {

    private final ArrayList<Ruutu> ruudut;

    public Tarkastaja(ArrayList<Ruutu> ruudut) {
        this.ruudut = ruudut;
    }

    public boolean tarkasta() {
        int aukinaiset = 0;
        for (Ruutu r : this.ruudut) {
            if (r.onkoAuki()) {
                aukinaiset++;
            }
        }
        return aukinaiset == this.ruudut.size();
    }
}
