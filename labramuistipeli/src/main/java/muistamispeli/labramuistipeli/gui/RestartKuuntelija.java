package muistamispeli.labramuistipeli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Pelin voittoruudussa olevan uudelleenkäynnistysnapin kuuntelija. Kutsuu vain
 * GraafinenLiittyma -luokan luoIkkuna -metodia, jolloin piirretään uusi peli
 * uusilla ruuduilla.
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
