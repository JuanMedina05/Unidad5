package Ejercicio27.test;

import Ejercicio27.Oficina;
import org.junit.Test;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void Test1(){
        Oficina[] o = {Oficina.getOficinaVacia(),Oficina.getOficinaPequeña(),Oficina.getOficinaMediana(),Oficina.getOficinaGrande()};

    }
}