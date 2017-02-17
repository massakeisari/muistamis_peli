/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import muistamispeli.labramuistipeli.Ruutu;

public class Kuuntelija implements ActionListener {

    private String n;
    private ArrayList<Ruutu> ruudut;
    private int avattujaRuutuja;
    private JButton nappi1;
    private JButton nappi2;

    public Kuuntelija(ArrayList<Ruutu> ruudut) {
        this.n = "";
        this.ruudut = ruudut;
        this.avattujaRuutuja = 0;
        this.nappi1 = null;
        this.nappi2 = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        avattujaRuutuja++;
        if (nappi1 == null) {
            this.nappi1 = (JButton) e.getSource();
            nappi1.setText(e.getActionCommand());
        } else {
            this.nappi2 = (JButton) e.getSource();
            nappi2.setText(e.getActionCommand());
        }
        if (!n.isEmpty()) {
            if (n.equals(e.getActionCommand())) {
                avaaRuudut(n);
            }
        }
        n = e.getActionCommand();
        if (nappi1 != null && nappi2 != null) {
            this.avattujaRuutuja = 0;
            n = "";
            if (!nappi1.getText().equals(nappi2.getText())) {
                nappi1.setText("X");
                nappi2.setText("X");
                this.nappi1 = null;
                this.nappi2 = null;
            }
        }
    }

    public void avaaRuudut(String n) {
        ruudut.get(Integer.parseInt(n) * 2).avaa();
        ruudut.get(Integer.parseInt(n) + (Integer.parseInt(n) + 1)).avaa();
    }

}
