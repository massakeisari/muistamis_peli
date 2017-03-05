package muistamispeli.labramuistipeli.gui;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import muistamispeli.labramuistipeli.Ruutu;

public class GraafinenLiittyma {

    private JFrame ikkuna;

    public GraafinenLiittyma() {
        this.ikkuna = new JFrame("Muistipeli");
    }

    /**
     * Metodi luo ja näyttää ikkunan, johon pelin graafinen sisältö laitetaan
     */
    public void luoIkkuna() {
        ikkuna.getContentPane().removeAll();
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel loppu = new JPanel(new GridLayout(6, 6));

        JButton ok = new JButton("Aloita uusi peli");
        ok.addActionListener(new RestartKuuntelija(this));
        loppu.add(ok);

        JPanel sisaltoPaneeli = new JPanel(new GridLayout(6, 6));

        //Lisää napit tässä
        lisaaNapit(sisaltoPaneeli);

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
     * @param sisalto Paneeli, joka on ikkunan sisällä, ja jonka sisälle napit
     * luodaan.
     */
    public void lisaaNapit(JPanel sisalto) {
        int apu = 0;
        ArrayList<Ruutu> napit = new ArrayList<>();
        Kuuntelija al = new Kuuntelija(napit, ikkuna);

        while (apu < 10) {
            Ruutu nappi = new Ruutu(apu, 1);
            nappi.setActionCommand(Integer.toString(apu));
            nappi.addActionListener(al);
            napit.add(nappi);
            Ruutu nappi2 = new Ruutu(apu, 2);
            nappi2.setActionCommand(Integer.toString(apu));
            nappi2.addActionListener(al);
            napit.add(nappi2);
            apu++;
        }
        Collections.shuffle(napit);
        for (JButton jb : napit) {
            sisalto.add(jb);
        }
    }

}
