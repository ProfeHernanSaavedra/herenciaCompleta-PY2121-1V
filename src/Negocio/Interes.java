package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Interes {
    
    protected String usuario,contraseña;
    protected int tiempoConectado;

    public Interes() {
    }

    public Interes(String usuario, String contraseña, int tiempoConectado) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tiempoConectado = tiempoConectado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", tiempoConectado=" + tiempoConectado + '}';
    }
    
    public void metodoSobreescrito(){
        
        System.out.println("Usuario: " + this.getUsuario());
        
    }
    
}
