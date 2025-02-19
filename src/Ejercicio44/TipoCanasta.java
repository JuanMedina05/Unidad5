package Ejercicio44;

public enum TipoCanasta {
    TIRO_LIBRE, CANASTA_NORMAL, TRIPLE;
    public int getValor(){
        return this.ordinal()+1;
    }
}
