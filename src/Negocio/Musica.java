
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Musica extends Interes implements ILikeTiempo{
    
    private String tipoMusica;

    public Musica() {
    }

    public Musica(String tipoMusica, String usuario, String contraseña, int tiempoConectado) {
        super(usuario, contraseña, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }

    public Musica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public Musica(String tipoMusica, int tiempoConectado, int like) {
        super(tiempoConectado, like);
        this.tipoMusica = tipoMusica;
    }
    
    
    
    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return super.toString() + " Musica{" + "tipoMusica=" + tipoMusica + '}';
    }

    @Override
    public void metodoSobreescrito() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
    }

    @Override
    public void gustosTiempo(int likes, int tiempo) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo conectado: " + tiempo);
    }
    
    
    
    
}
