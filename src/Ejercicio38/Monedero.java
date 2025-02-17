package Ejercicio38;

public class Monedero implements Adinerado{
    private double dinero;
    public Monedero(){
        this.dinero = 0;
    }
    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        if(this.dinero+cantidad<=1000) {
            this.dinero += cantidad;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        double aux = this.dinero;
        this.dinero -= this.dinero>cantidad ? cantidad:0;
        return aux>cantidad;
    }
}
