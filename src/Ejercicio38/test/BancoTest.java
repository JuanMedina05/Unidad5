package Ejercicio38.test;

import Ejercicio38.Banco;
import org.junit.Test;

import static org.junit.Assert.*;

public class BancoTest {
    @Test
    public void Test1(){
        Banco b = new Banco();
        assertEquals(true,b.añadirDinero(1000));
        assertEquals(1000,b.getDineroTotal(),0.01);
        assertEquals(true,b.retirarDinero(200));
        assertEquals(800,b.getDineroTotal(),0.01);
        assertEquals(false,b.retirarDinero(4000));
        assertEquals(800,b.getDineroTotal(),0.01);
    }
}