package Ejercicio43.test;

import Ejercicio43.MarcadorFacil;
import Ejercicio43.TipoCanasta;
import Ejercicio43.TipoEquipo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarcadorFacilTest {
    @Test
    public void test1(){
        MarcadorFacil marcadorFacil = new MarcadorFacil("Granada", "Estudiantes");
        for(int i=0; i<5; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TIRO_LIBRE);
        }
        for(int i=0; i<8; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.CANASTA_NORMAL);
        }
        for(int i=0; i<4; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.TRIPLE);
        }
        for(int i=0; i<3; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.TIRO_LIBRE);
        }
        for(int i=0; i<10; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.CANASTA_NORMAL);
        }
        marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.TRIPLE);
        assertEquals(33,marcadorFacil.getPuntos(TipoEquipo.LOCAL));
        assertEquals(26, marcadorFacil.getPuntos(TipoEquipo.VISITANTE));
    }
    @Test
    public void test2(){
        MarcadorFacil marcadorFacil = new MarcadorFacil("Granada", "Estudiantes");
        for(int i=0; i<50; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.CANASTA_NORMAL);
        }
        for(int i=0; i<40; i++){
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.CANASTA_NORMAL);
        }
        assertEquals("Granada 100-Estudiantes 80",marcadorFacil.getMarcador());
    }
}