package Ejercicio40.test;

import Ejercicio40.DepositoAguaInmutable;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepositoAguaInmutableTest {
    @Test(expected= IllegalArgumentException.class)
    public void Test1(){
        DepositoAguaInmutable d = new DepositoAguaInmutable(50,-100);
    }
    @Test(expected= IllegalArgumentException.class)
    public void Test2(){
        DepositoAguaInmutable d = new DepositoAguaInmutable(300,200);
    }
    @Test
    public void Test3(){
        DepositoAguaInmutable d = new DepositoAguaInmutable(20,500);
        assertEquals(4,d.getPorcentaje());
    }
    @Test
    public void Test4(){
        DepositoAguaInmutable d = new DepositoAguaInmutable(400,500);
        assertEquals(401,d.añadirLitro().capacidadActual());
        assertEquals(400,d.capacidadActual());
    }
}