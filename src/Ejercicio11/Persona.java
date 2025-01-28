package Ejercicio11;

import Ejercicio10.CuentaCorriente;
import Ejercicio10.DNI;

import java.time.LocalDate;

public class Persona {
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    public CuentaCorriente cuenta;
    public Persona(String n, DNI d, double s, LocalDate fn){
        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.cuenta = new CuentaCorriente();
    }
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        this(n,new DNI(numDNI,letraDNI),s,fn);
        this.cuenta = new CuentaCorriente();
    }
    public Persona(String n, DNI d){
        this(n,d,0,LocalDate.now());
        this.cuenta = new CuentaCorriente();
    }
    public Persona(String n, int numDNI, char letraDNI){
        this(n,new DNI(numDNI,letraDNI),0,LocalDate.now());
        this.cuenta = new CuentaCorriente();
    }
    public void aumentarSueldo(int porcentaje){
        this.sueldo = sueldo+(sueldo*porcentaje/100);
    }
    public void cobrarSueldo(){
        this.cuenta.añadirDinero((int)sueldo);
    }
}
