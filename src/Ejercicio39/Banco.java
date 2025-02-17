package Ejercicio39;

public class Banco implements Adinerado {
    private double dinero;
    public Banco(){
        this.dinero = 0;
    }
    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        this.dinero += cantidad;
        return true;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        double aux = this.dinero;
        this.dinero -= this.dinero>cantidad ? cantidad:0;
        return aux>cantidad;
    }
}
