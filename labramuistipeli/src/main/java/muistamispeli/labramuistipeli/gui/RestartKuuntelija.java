/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistamispeli.labramuistipeli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mikko
 */
public class RestartKuuntelija implements ActionListener{
    private GraafinenLiittyma gl;
    
    public RestartKuuntelija(GraafinenLiittyma gl) {
        this.gl = gl;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        gl.luoIkkuna();
    }
}
