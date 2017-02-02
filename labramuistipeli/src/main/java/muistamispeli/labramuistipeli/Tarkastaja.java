
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
}
