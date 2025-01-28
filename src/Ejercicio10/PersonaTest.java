package Ejercicio10;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void Test1(){
        Persona p = new Persona("Juan",new DNI("11111111H"),1500, LocalDate.now());
        assertEquals(0,p.cuenta.saldo,0.001);
        p.cobrarSueldo();
        p.cobrarSueldo();
        p.cobrarSueldo();
        assertEquals(4500,p.cuenta.saldo,0.001);
        p.aumentarSueldo(25);
        p.cobrarSueldo();
        assertEquals(6375,p.cuenta.saldo,0.001);
    }
}