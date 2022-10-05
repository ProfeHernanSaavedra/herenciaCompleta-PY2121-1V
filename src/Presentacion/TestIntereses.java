
package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestIntereses {
    
    public static void main(String[] args) {
        
        Interes musica = new Musica("POP", 120, 10);
        musica.setUsuario("juanito");
        musica.setContraseña("123");
        RedSocial rs = new RedSocial("Instagram",180, 50);
        TvSeries ts = new TvSeries("TERROR", 240, 5);
        
        Coleccion col = new Coleccion();
        
        col.agregarIntereses(musica);
        col.agregarIntereses(rs);
        col.agregarIntereses(ts);
        
        col.mostrarLista();
        
        col.masLike();
        col.masTiempoConectado();
        
        
    }
    
}
