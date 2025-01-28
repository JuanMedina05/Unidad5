package Ejercicio11;

import Ejercicio10.DNI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina{
    public String nombre;
    public List<Persona> trabajadores = new ArrayList<>();
    public Oficina(String nombre){
        this.nombre = nombre;
    }
    public Oficina(String nombre, int tipo){
        this.nombre = nombre;
    }
    public Oficina(){
        this.nombre = null;
    }
    public void añadirEmpleado(Persona p){
        this.trabajadores.add(p);
    }
    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac){
        this.trabajadores.add(new Persona(nombre, new DNI(DNI), sueldo, fechaNac));
    }
}
