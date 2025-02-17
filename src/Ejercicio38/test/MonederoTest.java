package Ejercicio38.test;

import Ejercicio38.Monedero;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonederoTest {
    @Test
    public void Test1() {
        Monedero m = new Monedero();
        assertEquals(true, m.añadirDinero(50));
        assertEquals(50, m.getDineroTotal(), 0.01);
        assertEquals(true, m.retirarDinero(30));
        assertEquals(20, m.getDineroTotal(), 0.01);
        assertEquals(false, m.retirarDinero(400));
        assertEquals(20, m.getDineroTotal(), 0.01);
    }
    @Test
    public void Test2() {
        Monedero m = new Monedero();
        assertEquals(true, m.añadirDinero(50));
        assertEquals(50, m.getDineroTotal(), 0.01);
        assertEquals(false, m.añadirDinero(2000));
        assertEquals(50, m.getDineroTotal(), 0.01);
        assertEquals(true, m.añadirDinero(950));
        assertEquals(1000, m.getDineroTotal(), 0.01);
        assertEquals(false,m.añadirDinero(1));
        assertEquals(1000, m.getDineroTotal(), 0.01);
    }
}