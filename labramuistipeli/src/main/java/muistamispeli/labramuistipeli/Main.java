package muistamispeli.labramuistipeli;

import java.util.ArrayList;
import muistamispeli.labramuistipeli.gui.GraafinenLiittyma;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ruutu> ruudut = new ArrayList<>();

        GraafinenLiittyma gl = new GraafinenLiittyma(ruudut);
        gl.luoIkkuna();

    }
}
