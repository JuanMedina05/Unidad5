package Ejercicio29.test;

import Ejercicio29.BolaDragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BolaDragonTest {
    @Before
    public void resetearSiguienteBola(){
        BolaDragon.reset();
    }
    @Test
    public void Test1() throws Exception {
        for(int i = 0;i<7;i++){
            BolaDragon.crearBolaDragon();
        }
    }
    @Test(expected=java.lang.Exception.class)
    public void Test2() throws Exception {
        for(int i = 0;i<9;i++){
            BolaDragon.crearBolaDragon();
        }
    }

}