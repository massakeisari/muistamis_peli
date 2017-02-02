package muistamispeli.labramuistipeli;

public class Ruutu {

    private final int numero;
    private boolean auki;

    public Ruutu(int numero) {
        this.numero = numero;
        this.auki = false;
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

}
