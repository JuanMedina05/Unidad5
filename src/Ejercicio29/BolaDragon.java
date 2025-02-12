package Ejercicio29;

public class BolaDragon {
    private final static int MAXIMO_BOLAS=7;
    private static int siguienteBola = 1;
    private int numero;
    private BolaDragon(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public static BolaDragon crearBolaDragon() throws Exception{
        if(BolaDragon.siguienteBola==BolaDragon.MAXIMO_BOLAS){
            throw new Exception("Ya se han creado 7 bolas de dragón");
        }else{
            siguienteBola ++;
            return new BolaDragon(BolaDragon.siguienteBola);
        }
    }
    public static void reset(){
        BolaDragon.siguienteBola = 1;
    }
}
