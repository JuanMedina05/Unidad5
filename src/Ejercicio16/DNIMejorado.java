package Ejercicio16;

public class DNIMejorado {
    private int numero;
    private char letra;
    public DNIMejorado(int n){
        this.numero = n;
        this.letra = calcularLetra(n);
    }
    public int getNumero(){
        return numero;
    }
    public char getLetra(){
        return letra;
    }
    private char calcularLetra(int n){
        char[] l = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
        return l[n%23];
    }
}
