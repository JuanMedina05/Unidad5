package Ejercicio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test
    public void Test1(){
        CuentaCorriente c = new CuentaCorriente(1253,850);
        assertEquals(1253,c.numero);
        assertEquals(850,c.saldo,0.001);
    }
    @Test
    public void Test2(){
        CuentaCorriente c = new CuentaCorriente(1253,850);
        c.añadirDinero(100);
        assertEquals(950,c.saldo,0.001);
        c.retirarDinero(200);
        assertEquals(750,c.saldo,0.001);
        c.retirarDinero(1000);
        assertEquals(750,c.saldo,0.001);
    }
}