package Ejercicio16;

import org.junit.Test;

import static org.junit.Assert.*;

public class DNIMejoradoTest {
    @Test
    public void Test1(){
        DNIMejorado dni = new DNIMejorado(11111111);
        assertEquals(11111111,dni.getNumero());
        assertEquals('H',dni.getLetra());
    }
}