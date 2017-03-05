package muistamispeli.labramuistipeli;

import java.util.ArrayList;

public class Tarkastaja {

    private final ArrayList<Ruutu> ruudut;

    public Tarkastaja(ArrayList<Ruutu> ruudut) {
        this.ruudut = ruudut;
    }

    /**
     * Käy ruudut -listan läpi ja ilmoittaa onko listan kaikki ruudut auki vai
     * ei.
     *
     * @return palauttaa true tai false, onko kaikki auki/ei.
     */
    public boolean tarkasta() {
        if (this.ruudut.isEmpty()) {
            return false;
        }
        int aukinaiset = 0;
        for (Ruutu r : this.ruudut) {
            if (r.onkoAuki()) {
                aukinaiset++;
            }
        }
        return aukinaiset == this.ruudut.size();
    }
}
