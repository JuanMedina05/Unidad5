package Ejercicio32.test;

import Ejercicio32.Bombo;
import org.junit.Test;

import static org.junit.Assert.*;

public class BomboTest {
    @Test
    public void Test1(){
        Bombo b = new Bombo(100);
        assertEquals(100,b.getNumeroBolas());
        for(int i = 0;i<100;i++){
            b.sacarBola();
        }
        assertEquals(0,b.getNumeroBolas());
    }
}