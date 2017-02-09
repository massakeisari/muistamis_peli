package muistamispeli.labramuistipeli;

import java.util.ArrayList;
import java.util.Scanner;
import muistamispeli.labramuistipeli.gui.GraafinenLiittyma;
import muistamispeli.labramuistipeli.tekstikayttoliittyma.Tekstikayttoliittyma;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ruutu> ruudut = new ArrayList<>();

        Scanner lukija = new Scanner(System.in);
        Peli p = new Peli(ruudut);
        Tekstikayttoliittyma tk = new Tekstikayttoliittyma(p, lukija);

        tk.kaynnista();
        
        GraafinenLiittyma gl = new GraafinenLiittyma(ruudut);
        gl.luoIkkuna();

    }
}
