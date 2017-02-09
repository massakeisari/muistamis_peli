/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli.tekstikayttoliittyma;

import java.util.Scanner;
import muistamispeli.labramuistipeli.Peli;

/**
 *
 * @author mikko
 */
public class Tekstikayttoliittyma {

    private Peli p;
    private Scanner lukija;

    public Tekstikayttoliittyma(Peli p, Scanner lukija) {
        this.p = p;
        this.lukija = lukija;
    }

    public void kaynnista() {
        System.out.print("Montako ruutua?\n>");
        int ruudut = Integer.parseInt(lukija.nextLine());
        p.luoRuudut(ruudut / 2);

        System.out.println(p.getRuutujenMaara());
    }
}
