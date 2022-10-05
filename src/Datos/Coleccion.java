package Datos;

import Negocio.Interes;
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion {
    
    private ArrayList<Interes> listaIntereses;

    public Coleccion() {
        
        listaIntereses = new ArrayList<>();
        
    }
    
    public void agregarIntereses(Interes interes)
    {
        listaIntereses.add(interes);
    }
    
    public void mostrarLista()
    {
        for (Interes interes : listaIntereses) {
            System.out.println(interes);
        }
        
    }
    
    public void masLike(){
        
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            
            if (interes.getLike() > mayor) {
                mayor = interes.getLike();
                clase = interes.getClass().getSimpleName();
            }
            
        }
        System.out.println("El tema de interes con mas likes es: " + clase);
        
    }
    
     public void masTiempoConectado(){
        
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            
            if (interes.getTiempoConectado() > mayor) {
                mayor = interes.getTiempoConectado();
                clase = interes.getClass().getSimpleName();
            }
            
        }
        System.out.println("El tema con mayor tiempo conectado es: " + clase);
        
    }
    
}
