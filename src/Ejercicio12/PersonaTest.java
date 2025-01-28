package Ejercicio12;

import Ejercicio12.DNI;
import Ejercicio12.Persona;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonaTest {
    @Test
    public void Test1(){
        Persona p = new Persona("Juan",new DNI("11111111H"),1500, LocalDate.now());
        assertEquals(0,p.getCuentaCorriente().saldo,0.001);
        p.cobrarSueldo();
        p.cobrarSueldo();
        p.cobrarSueldo();
        assertEquals(4500,p.getCuentaCorriente().saldo,0.001);
        p.aumentarSueldo(25);
        p.cobrarSueldo();
        assertEquals(6375,p.getCuentaCorriente().saldo,0.001);
    }
    @Test
    public void Test2(){
        Persona p = new Persona("Jose",12345678,'R',0,LocalDate.of(2010,5,5));
        assertEquals(false,p.esMayorEdad());
    }
    @Test
    public void Test3(){
        Persona p = new Persona("Jose",12345678,'R',0,LocalDate.of(1985,5,5));
        assertEquals(true,p.esMayorEdad());
    }
    @Test
    public void Test4(){
        Persona p = new Persona("Jose", new DNI("12345678R"));
        assertEquals(false,p.tieneDinero());
    }
    @Test
    public void Test5(){
        Persona p = new Persona("Jose",12345678,'R',900,LocalDate.of(1985,5,5));
        assertEquals(true,p.esMileurista());
    }
    @Test
    public void Test6(){
        Persona p = new Persona("Jose",12345678,'R',1800,LocalDate.of(1985,5,5));
        assertEquals(false,p.esMileurista());

    }
}