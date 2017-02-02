
package muistamispeli.labramuistipeli;

import java.util.List;


public class Tarkastaja {
    private List<Ruutu> ruudut;
    
    public Tarkastaja(List<Ruutu> ruudut) {
        this.ruudut = ruudut;
    }
    
    public boolean vertaa(Ruutu ruutu1, Ruutu ruutu2) {
        return ruutu1.getNumero() == ruutu2.getNumero();
    }
    
    public boolean onkoAuki(Ruutu r) {
        return r.onkoAuki();
    }
    
    public void tarkastaPari(Ruutu ruutu1, Ruutu ruutu2) {
        if(!onkoAuki(ruutu1) && !onkoAuki(ruutu2)) {
            if(!vertaa(ruutu1, ruutu2)) {
                ruutu1.sulje();
                ruutu2.sulje();
            }
        }
    }
    
    
}
