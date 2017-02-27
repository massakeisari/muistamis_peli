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
import javax.swing.JButton;
import javax.swing.JFrame;

import muistamispeli.labramuistipeli.Ruutu;
import muistamispeli.labramuistipeli.Tarkastaja;

public class Kuuntelija implements ActionListener {

    private String n;
    private ArrayList<Ruutu> ruudut;
    private int avattujaRuutuja;
    private JButton nappi1;
    private JButton nappi2;
    private Tarkastaja tarkastaja;
    private GraafinenLiittyma gl;
    private JFrame ikkuna;

    public Kuuntelija(ArrayList<Ruutu> ruudut, JFrame ikkuna) {
        this.n = "";
        this.ruudut = ruudut;
        this.avattujaRuutuja = 0;
        this.nappi1 = null;
        this.nappi2 = null;
        this.tarkastaja = new Tarkastaja(ruudut);
        this.ikkuna = ikkuna;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	CardLayout cl = (CardLayout) this.ikkuna.getContentPane().getLayout();
        cl.show(ikkuna.getContentPane(), "loppu");
        avattujaRuutuja++;
        if (nappi1 == null) {
            this.nappi1 = (JButton) e.getSource();
            nappi1.setText(e.getActionCommand());
        } else {
            this.nappi2 = (JButton) e.getSource();
            nappi2.setText(e.getActionCommand());
        }

        n = e.getActionCommand();
        if (nappi1 != null && nappi2 != null && avattujaRuutuja >= 2) {
            this.avattujaRuutuja = 0;

            if (!nappi1.getText().equals(nappi2.getText())) {
                nappi1.setText("X");
                nappi2.setText("X");
            } else {
                avaaRuudut();
            }
            n = "";
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
}
