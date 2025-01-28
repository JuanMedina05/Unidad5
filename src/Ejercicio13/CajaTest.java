package Ejercicio13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CajaTest {
    @Test
    public void Test1(){
        Caja c = new Caja("Hola amigos");
        assertEquals(false,c.esAbierta());
        c.abrir();
        assertEquals("Hola amigos",c.getMensaje());
    }
    @Test
    public void Test2(){
        Caja c = new Caja(true,"Adios amigos");
        assertEquals(true,c.esAbierta());
        assertEquals("Adios amigos",c.getMensaje());
    }
    @Test
    public void Test3(){
        Caja c = new Caja();
        assertEquals(false,c.esAbierta());
        c.abrir();
        assertEquals("Viva el tema 4",c.getMensaje());
    }
    @Test
    public void Test4(){
        Caja c = new Caja("Hola");
        assertEquals(null,c.getMensaje());
    }
}