package Ejercicio20;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
public class CuentaCorrienteTest {
    @Test(expected = IOException.class)
    public void Test1() throws IOException {
        CuentaCorriente c = new CuentaCorriente(12,2000);
        c.retirarDinero(6000);
        fail("Excepción no lanzada");
    }
}