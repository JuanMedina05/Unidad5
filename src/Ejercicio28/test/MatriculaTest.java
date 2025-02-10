package Ejercicio28.test;

import Ejercicio28.Matricula;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculaTest {
    @Test
    public void Test1(){
        Matricula m1 = new Matricula("","");
        Matricula m2 = new Matricula("","");
        Matricula m3 = new Matricula("","");
        assertEquals(4,Matricula.siguienteNumeroMatricula);
    }

}