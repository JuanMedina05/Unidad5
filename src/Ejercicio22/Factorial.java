package Ejercicio22;

public class Factorial {
    public Factorial(){}
    public int factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("numero negativo");
        }else {
            int aux = 0;
            if (n == 1 || n == 0) {
                aux = 1;
            } else {
                aux = n * factorial(n - 1);
            }
            return aux;
        }
    }
}
