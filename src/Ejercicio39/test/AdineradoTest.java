package Ejercicio39.test;

import Ejercicio39.Banco;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdineradoTest {
    @Test
    public void Test1(){
        Banco b = new Banco();
        assertEquals(false,b.tieneDinero());
    }
    @Test
    public void Test2(){
        Banco b1 = new Banco();
        Banco b2 = new Banco();
        b1.añadirDinero(7000);
        b2.añadirDinero(5000);
        b1.transferirHacia(b2,2500);
        assertEquals(4500,(int)b1.getDineroTotal());
        assertEquals(7500,(int)b2.getDineroTotal());
    }
    @Test
    public void Test3(){
        Banco b1 = new Banco();
        Banco b2 = new Banco();
        b1.añadirDinero(7000);
        b2.añadirDinero(5000);
        b2.transferirDesde(b1,2500);
        assertEquals(4500,(int)b1.getDineroTotal());
        assertEquals(7500,(int)b2.getDineroTotal());
    }
    @Test
    public void Test4(){
        Banco b1 = new Banco();
        Banco b2 = new Banco();
        b1.añadirDinero(100);
        b2.añadirDinero(5000);
        assertEquals(false, b1.transferirHacia(b2,500));
        assertEquals(100,(int)b1.getDineroTotal());
        assertEquals(5000,(int)b2.getDineroTotal());
    }
}