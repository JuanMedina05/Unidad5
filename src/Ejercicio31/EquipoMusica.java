package Ejercicio31;

public class EquipoMusica {
    private Altavoz[] altavoces;
    public EquipoMusica(int numeroAltavoces){
        this.altavoces = new Altavoz[numeroAltavoces];
        for(int i = 0; i<numeroAltavoces;i++){
            this.altavoces[i] = new Altavoz();
        }
    }
    public Altavoz getAltavoz(int posicion){
        return this.altavoces[posicion];
    }
    public void setVolumen(int numeroAltavoz,int volumen){
        this.altavoces[numeroAltavoz].setVolumen(volumen);
    }
}
