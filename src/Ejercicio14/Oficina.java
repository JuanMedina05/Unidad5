package Ejercicio14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina{
    private String nombre;
    private List<Persona> trabajadores = new ArrayList<>();
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
    public int getTotalEmpleados(){
        return trabajadores.size();
    }
    public int getTotalEmpleadosMileuristas(){
        int contador = 0;
        for(Persona p:trabajadores){
            contador = p.esMileurista() ? contador++:contador;
        }
        return contador;
    }
    public List<Persona> getMileuristas(){
        List<Persona> milEuristas = new ArrayList<>();
        for(Persona p:trabajadores){
            if(p.esMileurista()){
                milEuristas.add(p);
            }
        }
        return milEuristas;
    }
    public boolean trabaja(Persona p){
        return trabajadores.contains(p);
    }
    public  void pagarEmpleados(){
        for(Persona p:trabajadores){
            p.cobrarSueldo();
        }
    }
    public void mostrarInformeEmpleados(){
        for(Persona p:trabajadores){
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Sueldo: "+p.getSueldo());
            System.out.println("El empleado "+(p.esMileurista() ? "":"no"+" es mileurista"));
        }
    }
}
