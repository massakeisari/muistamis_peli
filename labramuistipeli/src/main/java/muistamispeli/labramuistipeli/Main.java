/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli;

import java.util.Scanner;
import muistamispeli.labramuistipeli.tekstikayttoliittyma.Tekstikayttoliittyma;

/**
 *
 * @author mikko
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println(" test");
        
        Scanner lukija = new Scanner(System.in);
        Peli p = new Peli();
        Tekstikayttoliittyma tk = new Tekstikayttoliittyma(p, lukija);
        
        tk.kaynnista();
        
    }
}