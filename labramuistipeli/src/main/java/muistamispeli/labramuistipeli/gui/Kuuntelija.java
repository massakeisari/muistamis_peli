/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli.gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

import muistamispeli.labramuistipeli.Ruutu;
import muistamispeli.labramuistipeli.Tarkastaja;

public class Kuuntelija implements ActionListener {

    private String n;
    private final ArrayList<Ruutu> ruudut;
    private int avattujaRuutuja;
    private Ruutu nappi1;
    private Ruutu nappi2;
    private GraafinenLiittyma gl;
    private final JFrame ikkuna;
    private boolean sulje;

    public Kuuntelija(ArrayList<Ruutu> ruudut, JFrame ikkuna) {
        this.n = "";
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
            nappi1.avaa();
        } else {
            this.nappi2 = (Ruutu) e.getSource();
            nappi2.setText(e.getActionCommand());
            nappi2.avaa();
        }

        avattujaRuutuja++;
        n = e.getActionCommand();
        if (nappi1 != null && nappi2 != null && avattujaRuutuja >= 2) {
            this.avattujaRuutuja = 0;

            if (nappi1.getNumero() != nappi2.getNumero() || nappi1.getTunnus() == nappi2.getTunnus()) {
                this.sulje = true;
            } else {
                avaaRuudut();
                tarkasta();
            }
            n = "";

        }

        if (nappi1 != null && nappi2 != null && this.sulje == false) {
            this.nappi1 = null;
            this.nappi2 = null;
        }
    }

    public void avaaRuudut() {
        for (Ruutu r : this.ruudut) {
            if (Integer.toString(r.getNumero()).equals(n)) {
                r.avaa();
            }
        }
    }

    public void suljeNapit() {
        nappi1.setText("X");
        nappi2.setText("X");
        nappi1.sulje();
        nappi2.sulje();
    }

    public void tarkasta() {
        Tarkastaja tk = new Tarkastaja(this.ruudut);
        if (tk.tarkasta()) {
            CardLayout cl = (CardLayout) this.ikkuna.getContentPane().getLayout();
            cl.show(ikkuna.getContentPane(), "loppu");
        }
    }
}
