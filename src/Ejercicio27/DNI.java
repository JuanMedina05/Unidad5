package Ejercicio27;

public class DNI {
    public int numero;
    public char letra;
    public DNI(String dni){
        this(Integer.parseInt(dni.substring(0,dni.length()-1)),dni.charAt(dni.length()-1));
    }
    public DNI(int n, char l){
        this.numero = n;
        this.letra = l;
    }

}
