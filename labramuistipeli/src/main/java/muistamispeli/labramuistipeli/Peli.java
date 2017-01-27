/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikko
 */
public class Peli {
    private List<Ruutu> ruudut;

    public Peli() {
        this.ruudut = new ArrayList<>();
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