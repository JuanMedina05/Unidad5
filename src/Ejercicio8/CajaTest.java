package Ejercicio8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CajaTest {
    @Test
    public void Test1(){
        Caja c = new Caja("Hola");
        c.setMensaje("Adios");
        assertEquals(false,c.abierto);
        assertEquals("Hola",c.mensaje);
    }

    @Test
    public void Test2(){
        Caja c = new Caja(true,"Hola");
        c.setMensaje("Adios");
        assertEquals(true,c.abierto);
        assertEquals("Adios",c.mensaje);
    }

    @Test
    public void Test3(){
        Caja c = new Caja(true,"Hola");
        c.pasarMayusculas();
        assertEquals(true,c.abierto);
        assertEquals("HOLA",c.mensaje);
    }
}