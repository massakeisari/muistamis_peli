package muistamispeli.labramuistipeli;

import java.util.List;

public class Tarkastaja {

    public Tarkastaja() {

    }

    /**
     * 
     * @param ruutu1 Ruutu johon verrataan
     * @param ruutu2 Ruutu jota verrataan ruutu1:een
     * @return  palauttaa true tai false, eli onko ruudulla sama arvo vai ei
     */
    public boolean vertaa(Ruutu ruutu1, Ruutu ruutu2) {
        return ruutu1.getNumero() == ruutu2.getNumero();
    }

    public boolean onkoAuki(Ruutu r) {
        return r.onkoAuki();
    }

    /**
     * Metodi tarkastaa onko avattujen ruutujen numerot samat vai ei,
     * ja sulkee ne jos ei.
     * @param ruutu1 
     * @param ruutu2 
     */
    public void tarkastaPari(Ruutu ruutu1, Ruutu ruutu2) {
        if (onkoAuki(ruutu1) && onkoAuki(ruutu2)) {
            if (!vertaa(ruutu1, ruutu2)) {
                ruutu1.sulje();
                ruutu2.sulje();
            }
        }
    }

}
