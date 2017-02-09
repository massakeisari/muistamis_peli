package muistamispeli.labramuistipeli.gui;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import muistamispeli.labramuistipeli.Ruutu;

public class GraafinenLiittyma {
    private int x;
    private int y;
    private ArrayList<Ruutu> ruudut;
    
    public GraafinenLiittyma(ArrayList<Ruutu> ruudut) {
        this.x = x;
        this.y = y;
        this.ruudut = ruudut;
    }
    
    public void luoIkkuna() {
        JFrame ikkuna = new JFrame("Muistipeli");
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel sisaltoPaneeli = new JPanel(new GridLayout(6, 6));
        
        //Lisää napit tässä
        lisaaNapit(ikkuna, sisaltoPaneeli);
        ikkuna.setContentPane(sisaltoPaneeli);
        
        ikkuna.pack();
        ikkuna.setVisible(true);
        
    }
    
    public void lisaaNapit(JFrame ikkuna, JPanel sisalto) {
        int apu = 0;
        while(apu < ruudut.size()) {
            JButton nappi = new JButton(Integer.toString(apu));
            sisalto.add(nappi);
            JButton nappi2 = new JButton(Integer.toString(apu));
            sisalto.add(nappi2);
            apu++;
        }
    }

}
