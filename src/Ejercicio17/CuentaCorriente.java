package Ejercicio17;

import java.util.Random;

public class CuentaCorriente {
    public int numero;
    public double saldo;
    public CuentaCorriente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public CuentaCorriente(){
        this(new Random().nextInt(1001),0);
    }
    public CuentaCorriente(int numero){
        this(numero,0);
    }

    public void añadirDinero(int cantidad){
        this.saldo += cantidad;
    }
    public void retirarDinero(int cantidad){
        this.saldo -= cantidad>saldo ? 0:cantidad;
    }
}
