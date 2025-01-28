package Ejercicio11;

import Ejercicio10.DNI;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void Test1(){
        Oficina o = new Oficina();
        o.añadirEmpleado("Antonio","44444444M",2000, LocalDate.now());
        assertEquals(44444444,o.trabajadores.getFirst().dni.numero);
        assertEquals('M',o.trabajadores.getFirst().dni.letra);
    }
}