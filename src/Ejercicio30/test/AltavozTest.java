package Ejercicio30.test;

import Ejercicio30.Altavoz;
import org.junit.Test;

import static org.junit.Assert.*;

public class AltavozTest {
    @Test
    public void Test1(){
        Altavoz a = new Altavoz();
        assertEquals(Altavoz.VOL_MIN,a.getVolumen());
        a.ponerVolumenMaximo();
        assertEquals(Altavoz.VOL_MAX,a.getVolumen());
    }
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void Test2(){
        Altavoz a = new Altavoz();
        a.setVolumen(-28);
    }
    @Test
    public void Test3(){
        Altavoz a = new Altavoz();
        a.setVolumen(127);
        assertEquals("[127]*****-----",a.toString());
        a.ponerVolumenMaximo();
        assertEquals("[255]**********",a.toString());
    }

}