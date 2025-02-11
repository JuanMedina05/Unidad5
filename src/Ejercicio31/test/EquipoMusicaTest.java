package Ejercicio31.test;

import Ejercicio31.Altavoz;
import Ejercicio31.EquipoMusica;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipoMusicaTest {
    @Test
    public void Test1(){
        EquipoMusica e = new EquipoMusica(5);
        for(int i=0;i<5;i++){
            assertEquals(0,e.getAltavoz(i).getVolumen());
        }
    }
    @Test
    public void Test2(){
        EquipoMusica e = new EquipoMusica(10);
        for(int i = 0;i<10;i++){
            e.setVolumen(i,i%2==0 ? Altavoz.VOL_MAX:50);
        }
        for(int i = 0;i<10;i++){
            assertEquals(i%2==0?Altavoz.VOL_MAX:50,e.getAltavoz(i).getVolumen());
        }
    }
}