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

    public Kuuntelija(ArrayList<Ruutu> ruudut) {
        this.n = "";
        this.ruudut = ruudut;
        this.avattujaRuutuja = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        avattujaRuutuja++;
        JButton olio = (JButton) e.getSource();
        olio.setText(e.getActionCommand());

        if (!n.isEmpty()) {
            if (n.equals(e.getActionCommand())) {
                avaaRuudut(n);
            }
        }
        n = e.getActionCommand();
        if (this.avattujaRuutuja >= 2) {
            this.avattujaRuutuja = 0;
            n = "";
            if (!ruudut.get(Integer.parseInt(e.getActionCommand())*2).onkoAuki()) {
                olio.setText("X");
            }
        }
    }

    public void avaaRuudut(String n) {
        ruudut.get(Integer.parseInt(n)*2).avaa();
        ruudut.get(Integer.parseInt(n) + (Integer.parseInt(n) +1)).avaa();
    }

}
