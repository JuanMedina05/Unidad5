package Ejercicio26;

public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    public double getValorReal(){
        return ((double)numerador)/denominador;
    }
    public Fraccion getInversa(){
        return new Fraccion(this.denominador,this.numerador);
    }
    public static Fraccion sumar(Fraccion a, Fraccion b){
        return new Fraccion(a.numerador*b.denominador+a.denominador*b.numerador,a.denominador*b.denominador);
    }
    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        return new Fraccion(a.numerador*b.numerador, a.denominador*b.denominador);
    }
    public static Fraccion dividir(Fraccion a, Fraccion b){
        return new Fraccion(a.numerador*b.denominador,a.denominador*b.denominador);
    }
}
