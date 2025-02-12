package Ejercicio30;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;
    public Altavoz(){
        this.volumen = 0;
    }
    public void ponerVolumenMaximo(){
        this.volumen = Altavoz.VOL_MAX;
    }
    public void setVolumen(int v){
        if(v>=Altavoz.VOL_MIN&&v<=Altavoz.VOL_MAX){
            this.volumen = v;
        }else{
            throw new IllegalArgumentException("Volumen fuera de rango");
        }
    }
    public int getVolumen(){
        return this.volumen;
    }
    public String toString(){
        int porcentaje = (int)Math.round(this.volumen*10.0/255);
        String result = "["+this.volumen+"]";
        for(int i=0;i<10;i++){
            result += porcentaje>0 ? "*":"-";
            porcentaje--;
        }
        return result;
    }
}
