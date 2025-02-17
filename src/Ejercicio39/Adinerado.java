package Ejercicio39;

public interface Adinerado {
    public static final int TRANSFERENCIA_MINIMA = 1526;
    public abstract double getDineroTotal();
    public abstract boolean añadirDinero(int cantidad);
    public abstract boolean retirarDinero(int cantidad);
    default boolean tieneDinero(){
        return getDineroTotal()>0;
    }
    default boolean transferirHacia(Adinerado receptor,double cantidad){
        int dinero = (int)getDineroTotal();
        if(dinero>(int)cantidad && cantidad>TRANSFERENCIA_MINIMA) {
            receptor.añadirDinero((int) cantidad);
            retirarDinero((int) cantidad);
        }
        return dinero>cantidad && cantidad>TRANSFERENCIA_MINIMA;
    }
    default boolean transferirDesde(Adinerado emisor, double cantidad){
        int dinero = (int)emisor.getDineroTotal();
        if(dinero>(int)cantidad && (int)cantidad>TRANSFERENCIA_MINIMA) {
            añadirDinero((int) cantidad);
            emisor.retirarDinero((int) cantidad);
        }
        return dinero>cantidad && cantidad>TRANSFERENCIA_MINIMA;
    }
    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
        return emisor.transferirHacia(receptor,cantidad);
    }
}
