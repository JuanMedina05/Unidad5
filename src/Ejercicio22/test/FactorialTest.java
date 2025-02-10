package Ejercicio22.test;

import Ejercicio22.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void Test1(){
        assertEquals(1, new Factorial().factorial(0));
    }
    @Test
    public void Test2(){
        assertEquals(1, new Factorial().factorial(1));
    }
    @Test
    public void Test3(){
        assertEquals(120, new Factorial().factorial(5));
    }
    @Test
    public void Test4(){
        assertEquals(5040, new Factorial().factorial(7));
    }
    @Test
    public void Test5(){
        assertEquals(-2102132736, new Factorial().factorial(20));
    }
    @Test(expected=java.lang.StackOverflowError.class)
    public void Test6(){
        new Factorial().factorial(200000000);
    }
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void Test7(){
        new Factorial().factorial(-2);
    }
}