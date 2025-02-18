package Ejercicio42;

public enum TipoCanasta {
    TIRO_LIBRE, CANASTA_NORMAL, TRIPLE;
    public int getValor(){
        switch (this.ordinal()){
            case 1 : return 1;
            case 2 : return 2;
            case 3 : return 3;
            default : return 0;
        }
    }
}
