/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli;

/**
 *
 * @author mikko
 */
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