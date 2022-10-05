package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public abstract class Interes {
    
    protected String usuario,contraseña;
    protected int tiempoConectado;
    protected int like;

    public Interes() {
    }

    public Interes(String usuario, String contraseña, int tiempoConectado) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tiempoConectado = tiempoConectado;
    }

    public Interes(int tiempoConectado, int like) {
        this.tiempoConectado = tiempoConectado;
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
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
        return "Interes{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", tiempoConectado=" + tiempoConectado +" Likes: " + like+ '}';
    }
    
    public abstract void metodoSobreescrito();
    
}
