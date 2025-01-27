package Ejercicio8;

public class Caja {
    public boolean abierto;
    public String mensaje;
    public Caja(String m){

        this(false,m);
    }
    public Caja(boolean a, String m){
        this.abierto = a;
        this.mensaje = m;
    }
    public Caja(){

        this(false,"Viva el tema 4");
    }
    public void setMensaje(String m){
        this.mensaje = abierto ? m:mensaje;
    }
    public void pasarMayusculas(){
        this.mensaje = mensaje.toUpperCase();
    }
}