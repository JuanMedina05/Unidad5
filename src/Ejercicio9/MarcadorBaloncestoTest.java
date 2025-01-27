package Ejercicio9;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test
    public void Test1(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",0,"Estudiantes",0, LocalDate.now());
        mv.añadirCanasta('L',1);
        mv.añadirCanasta('L',1);
        mv.añadirCanasta('L',1);
        mv.añadirCanasta('L',1);
        mv.añadirCanasta('L',1);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',2);
        mv.añadirCanasta('L',3);
        mv.añadirCanasta('L',3);
        mv.añadirCanasta('L',3);
        mv.añadirCanasta('L',3);
        mv.añadirCanasta('V',1);
        mv.añadirCanasta('V',1);
        mv.añadirCanasta('V',1);
        for(int i = 0;i<10;i++) {
            mv.añadirCanasta('V', 2);
        }
        mv.añadirCanasta('V',3);
        assertEquals(33,mv.puntosLocal);
        assertEquals(26,mv.puntosVisitante);
    }
    @Test
    public void Test2(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",100,"Estudiantes",80, LocalDate.now());
        mv.reset();
        assertEquals(0,mv.puntosLocal);
        assertEquals(0,mv.puntosVisitante);
    }
    @Test
    public void Test3(){
        MarcadorBaloncesto mv = new MarcadorBaloncesto("Granada",10,"Estudiantes",12, LocalDate.now());
        mv.añadirCanasta('V',4);
        assertEquals(10,mv.puntosLocal);
        assertEquals(12,mv.puntosVisitante);

    }
}