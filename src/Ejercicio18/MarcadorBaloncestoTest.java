package Ejercicio18;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MarcadorBaloncestoTest {
    @Test
    public void Test1(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",33,"Estudiantes",26, LocalDate.now());
        assertEquals(33,mv.getPuntosLocal());
        assertEquals(26,mv.getPuntosVisitante());
    }
    @Test
    public void Test2(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",100,"Estudiantes",80, LocalDate.now());
        mv.reset();
        assertEquals(0,mv.getPuntosLocal());
        assertEquals(0,mv.getPuntosVisitante());
    }
    @Test
    public void Test3(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",10,"Estudiantes",12, LocalDate.now());
        mv.añadirCanasta('V',4);
        assertEquals(10,mv.getPuntosLocal());
        assertEquals(12,mv.getPuntosVisitante());

    }
    @Test
    public void Test4(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",80,"Estudiantes",80,LocalDate.now());
        assertEquals(true,mv.hayEmpate());
        assertEquals(false,mv.ganaLocal());
        assertEquals(false,mv.ganaVisitante());
    }
    @Test
    public void Test5(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",90,"Estudiantes",80,LocalDate.now());
        assertEquals(false,mv.hayEmpate());
        assertEquals(true,mv.ganaLocal());
        assertEquals(false,mv.ganaVisitante());
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void Test6(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Gr","Est");
        mv.añadirCanasta('V',0);
        fail("Debería haber saltado una excepción");
    }
}