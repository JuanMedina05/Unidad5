package Ejercicio6;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class PuntoTest {
    @Test
    public void test1(){
        Punto p = new Punto(120,90);
        assertEquals(120,p.x);
        assertEquals(90,p.y);
    }
    @Test
    public void test2(){
        Punto p = new Punto(-200,10000);
        assertEquals(0,p.x);
        assertEquals((int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()),p.y);
    }
    @Test
    public void test3(){
        Punto p = new Punto(new Punto(120,90));
        assertEquals(60,p.x);
        assertEquals(45,p.y);
    }
    @Test
    public void test4(){
        Punto p = new Punto((double)45,100);
        assertEquals(70,p.x);
        assertEquals(70,p.y);
    }
}