package Ejercicio12;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;
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
    public String getNombre(){
        return this.nombre;
    }
    public DNI getDNI(){
        return this.dni;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public CuentaCorriente getCuentaCorriente(){
        return this.cuenta;
    }
    public boolean esMayorEdad(){
        return LocalDate.now().getYear() - fechaNacimiento.getYear() >= 18;
    }
    public boolean tieneDinero(){
        return cuenta.saldo > 0;
    }
    public boolean esMileurista(){
        return sueldo < 1200;
    }
}
