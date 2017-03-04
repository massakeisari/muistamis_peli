package muistamispeli.labramuistipeli;

import javax.swing.JButton;

public class Ruutu extends JButton {

    private final int numero;
    private boolean auki;
    private final int tunnus;

    public Ruutu(int numero, int tunnus) {
        super("X");
        this.numero = numero;
        this.auki = false;
        this.tunnus = tunnus;
    }

    public void avaa() {
        this.auki = true;
    }

    public void sulje() {
        this.auki = false;
    }

    public boolean onkoAuki() {
        return this.auki;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getTunnus() {
        return this.tunnus;
    }

}
