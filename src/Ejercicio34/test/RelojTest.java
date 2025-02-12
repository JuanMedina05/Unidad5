package Ejercicio34.test;

import Ejercicio34.Reloj;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class RelojTest {
    @Test
    public void Test1(){
        Reloj r = new Reloj(LocalTime.of(16,00));
        r.añadir(60*60);
        assertEquals(LocalTime.of(17,00),r.getHora());
    }
    @Test
    public void Test2(){
        Reloj r = new Reloj(LocalTime.of(23,59));
        r.añadir(60);
        assertEquals(LocalTime.of(00,00),r.getHora());
    }
    @Test
    public void Test3(){
        Reloj r = new Reloj(LocalTime.of(19,30));
        assertEquals(false,r.esNoche());
        r.añadir(60*60);
        assertEquals(true,r.esNoche());
    }
    @Test
    public void Test4(){
        Reloj r = new Reloj(LocalTime.of(7,30));
        assertEquals(true,r.esNoche());
        r.añadir(60*60);
        assertEquals(false,r.esNoche());
    }
    @Test
    public void Test5(){
        Reloj r = new Reloj(LocalTime.of(15,28));
        assertEquals("15:28:00",r.toString());
    }

}