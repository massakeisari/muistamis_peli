package muistamispeli.labramuistipeli.gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

import muistamispeli.labramuistipeli.Ruutu;
import muistamispeli.labramuistipeli.Tarkastaja;

public class Kuuntelija implements ActionListener {

    private final ArrayList<Ruutu> ruudut;
    private int avattujaRuutuja;
    private Ruutu nappi1;
    private Ruutu nappi2;
    private GraafinenLiittyma gl;
    private final JFrame ikkuna;
    private boolean sulje;

    public Kuuntelija(ArrayList<Ruutu> ruudut, JFrame ikkuna) {
        this.ruudut = ruudut;
        this.avattujaRuutuja = 0;
        this.nappi1 = null;
        this.nappi2 = null;
        this.ikkuna = ikkuna;
        this.sulje = false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.sulje) {
            suljeNapit();
            this.sulje = false;
            this.nappi1 = null;
            this.nappi2 = null;
        }
        if (nappi1 == null) {
            this.nappi1 = (Ruutu) e.getSource();
            nappi1.setText(e.getActionCommand());
        } else {
            this.nappi2 = (Ruutu) e.getSource();
            nappi2.setText(e.getActionCommand());
        }

        avattujaRuutuja++;
        if (nappi1 != null && nappi2 != null && avattujaRuutuja >= 2) {
            this.avattujaRuutuja = 0;

            if (nappi1.getNumero() != nappi2.getNumero() || nappi1.getTunnus() == nappi2.getTunnus()) {
                this.sulje = true;
            } else {
                avaaRuudut();
                tarkasta();
            }
        }
        tyhjennaNapit();
    }

    /**
     * Tyhjentää nappi -muuttujat seuraavaa paria varten
     */
    public void tyhjennaNapit() {
        if (nappi1 != null && nappi2 != null && this.sulje == false) {
            this.nappi1 = null;
            this.nappi2 = null;
        }
    }

    /**
     * Avaa nappi -muuttujissa olevat ruudut, jotta tiedetään että niillä on
     * löydetty pari
     */
    public void avaaRuudut() {
        nappi1.avaa();
        nappi2.avaa();
    }

    /**
     * Sulkee napit, jos niille ei ole löytynyt paria.
     */
    public void suljeNapit() {
        if (!nappi1.onkoAuki()) {
            nappi1.setText("X");
            nappi1.sulje();
        }
        if (!nappi2.onkoAuki()) {
            nappi2.setText("X");
            nappi2.sulje();
        }
    }

    /**
     * Tarkastaa, onko kaikki parit löydetty, ja lopettaa pelin jos on.
     */
    public void tarkasta() {
        Tarkastaja tk = new Tarkastaja(this.ruudut);
        if (tk.tarkasta()) {
            CardLayout cl = (CardLayout) this.ikkuna.getContentPane().getLayout();
            cl.show(ikkuna.getContentPane(), "loppu");
        }
    }
}
