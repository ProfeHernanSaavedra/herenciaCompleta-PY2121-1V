package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class RedSocial extends Interes implements ILikeTiempo{
    
    private String nombre;

    public RedSocial() {
    }

    public RedSocial(String nombre, String usuario, String contraseña, int tiempoConectado) {
        super(usuario, contraseña, tiempoConectado);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " RedSocial{" + "nombre=" + nombre + '}';
    }

    @Override
    public void metodoSobreescrito() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Nombre red social: " + this.getNombre());
    }

    @Override
    public void gustosTiempo(int likes, int tiempo) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo conectado: " + tiempo);
    }
    
    
    
}
