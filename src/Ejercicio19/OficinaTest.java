package Ejercicio19;

import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
    @Test(expected = IllegalArgumentException.class)
    public void Test2(){
        Oficina o = new Oficina("Lomo",4);
        fail("No se lanza la excepción");
    }
    @Test
    public void Test3() throws IOException {
        Oficina o = new Oficina();
        o.añadirEmpleado("","12345678R",1000,LocalDate.now());
        o.añadirEmpleado("","12345678R",2000,LocalDate.now());
        o.añadirEmpleado("","12345678R",1500,LocalDate.now());
        o.añadirEmpleado("","12345678R",900,LocalDate.now());
        assertEquals(1350,o.getSueldoMedio(),0.1);
    }
    @Test(expected = IOException.class)
    public void Test4() throws IOException {
        Oficina o = new Oficina();
        o.getSueldoMedio();
        fail("No se lanza la excepción");
    }
}