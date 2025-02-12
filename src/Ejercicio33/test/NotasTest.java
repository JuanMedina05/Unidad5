package Ejercicio33.test;

import Ejercicio33.Notas;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotasTest {
    @Test
    public void Test1(){
        Notas n = new Notas();
        n.añadirNota(8);
        n.añadirNota(5);
        n.añadirNota(9);
        n.añadirNota(1);
        n.añadirNota(6);
        assertEquals(9,n.calcularNotaMaxima(),0.01);
        assertEquals(5.8,n.calcularNotaMedia(),0.01);
    }
    @Test(expected = java.lang.IllegalStateException.class)
    public void Test2(){
        Notas n = new Notas();
        n.calcularNotaMaxima();
    }
}