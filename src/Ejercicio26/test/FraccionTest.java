package Ejercicio26.test;

import Ejercicio26.Fraccion;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraccionTest {
    @Test
    public void Test1(){
        Fraccion f = Fraccion.sumar(new Fraccion(1,2),new Fraccion(3,4));
        assertEquals(10, f.getNumerador());
        assertEquals(8, f.getDenominador());

    }
    @Test
    public void Test2(){
        Fraccion f = Fraccion.sumar(new Fraccion(2,5),new Fraccion(3,7));
        assertEquals(29, f.getNumerador());
        assertEquals(35, f.getDenominador());
    }
    @Test
    public void Test3(){
        Fraccion f = Fraccion.multiplicar(new Fraccion(1,2),new Fraccion(4,3));
        assertEquals(4, f.getNumerador());
        assertEquals(6, f.getDenominador());

    }
    @Test
    public void Test4(){
        Fraccion f = Fraccion.multiplicar(new Fraccion(1,2),(Fraccion.sumar(new Fraccion(3,7),new Fraccion(8,5))));
        assertEquals(71, f.getNumerador());
        assertEquals(70, f.getDenominador());
    }
}