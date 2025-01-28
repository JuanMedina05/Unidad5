package Ejercicio14;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class OficinaTest {
    @Test
    public void Test1(){
        Oficina o = new Oficina();
        Persona p1 = new Persona("Jose",new DNI("12345678Y"),1000,LocalDate.now());
        Persona p2 = new Persona("JoseJu",new DNI("12695678Y"),2000,LocalDate.now());
        o.añadirEmpleado(p1);
        o.añadirEmpleado(p2);
        assertEquals(true,o.trabaja(p1));
        assertEquals(true,o.trabaja(p2));
        o.pagarEmpleados();
        assertEquals(1000,p1.getCuentaCorriente().saldo,0.001);
        assertEquals(2000,p2.getCuentaCorriente().saldo,0.001);
    }
}