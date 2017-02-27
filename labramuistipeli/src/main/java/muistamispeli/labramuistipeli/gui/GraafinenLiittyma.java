package muistamispeli.labramuistipeli.gui;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import muistamispeli.labramuistipeli.Ruutu;

public class GraafinenLiittyma {

    private ArrayList<Ruutu> ruudut;

    public GraafinenLiittyma(ArrayList<Ruutu> ruudut) {
        this.ruudut = ruudut;
    }

    /**
     * Metodi luo ja näyttää ikkunan, johon pelin graafinen sisältö laitetaan
     */
    public void luoIkkuna() {
        JFrame ikkuna = new JFrame("Muistipeli");
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel loppu = new JPanel(new GridLayout(6, 6));
        JButton ok = new JButton("Lopeta");
        loppu.add(ok);

        JPanel sisaltoPaneeli = new JPanel(new GridLayout(6, 6));

        //Lisää napit tässä
        lisaaNapit(ikkuna, sisaltoPaneeli);

        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(sisaltoPaneeli, "peli");
        cardPanel.add(loppu, "loppu");
        ikkuna.setContentPane(cardPanel);

        ikkuna.pack();
        ikkuna.setVisible(true);

    }

    /**
     * Metodi lisää ikkunaan napit
     *
     * @param ikkuna
     * @param sisalto Paneeli, joka on ikkunan sisällä, ja jonka sisälle napit
     * luodaan.
     */
    public void lisaaNapit(JFrame ikkuna, JPanel sisalto) {
        int apu = 0;
        Kuuntelija al = new Kuuntelija(ruudut, ikkuna);
        while (apu < ruudut.size()) {
            JButton nappi = new JButton("X");
            nappi.setActionCommand(Integer.toString(apu));
            nappi.addActionListener(al);
            sisalto.add(nappi);
            JButton nappi2 = new JButton("X");
            nappi2.setActionCommand(Integer.toString(apu));
            nappi2.addActionListener(al);
            sisalto.add(nappi2);
            apu++;
        }
    }

}
