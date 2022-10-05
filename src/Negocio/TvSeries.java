
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class TvSeries extends Interes implements ILikeTiempo{
    
    private String genero;

    public TvSeries() {
    }

    public TvSeries(String genero, String usuario, String contraseña, int tiempoConectado) {
        super(usuario, contraseña, tiempoConectado);
        this.genero = genero;
    }

    public TvSeries(String genero, int tiempoConectado, int like) {
        super(tiempoConectado, like);
        this.genero = genero;
    }
    
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + " TvSeries{" + "genero=" + genero + '}';
    }

    @Override
    public void metodoSobreescrito() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Género Película: " + this.getGenero());
    }

    @Override
    public void gustosTiempo(int likes, int tiempo) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo conectado: " + tiempo);
    }
    
    
    
}
