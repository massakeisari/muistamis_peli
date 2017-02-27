package muistamispeli.labramuistipeli.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Muokkaaja {
	private JFrame ikkuna;
	
	public Muokkaaja(JFrame ikkuna) {
		this.ikkuna = ikkuna;
	}
	
	public void naytaLopetusIkkuna() {
		JFrame likkuna = new JFrame("Voitit!");
		likkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel sisalto = new JPanel(new GridLayout(6, 6));
		
		JButton ok = new JButton("Lopeta");
		sisalto.add(ok);
		likkuna.setContentPane(sisalto);
		
		
		likkuna.pack();
		likkuna.setVisible(true);
	}
}
