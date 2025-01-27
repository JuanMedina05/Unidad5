package Ejercicio2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CajaTest {
    @Test
    public void Test1(){
        Caja c = new Caja("Hola amigos");
        assertEquals(false,c.abierto);
        assertEquals("Hola amigos",c.mensaje);
    }
    @Test
    public void Test2(){
        Caja c = new Caja(true,"Adios amigos");
        assertEquals(true,c.abierto);
        assertEquals("Adios amigos",c.mensaje);
    }
    @Test
    public void Test3(){
        Caja c = new Caja();
        assertEquals(false,c.abierto);
        assertEquals("Viva el tema 4",c.mensaje);
    }
}