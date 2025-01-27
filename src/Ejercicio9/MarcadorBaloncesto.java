package Ejercicio9;

import java.time.LocalDate;

public class MarcadorBaloncesto {
    public String nombreLocal;
    public String nombreVisitante;
    public int puntosLocal;
    public int puntosVisitante;
    public LocalDate fecha;
    public MarcadorBaloncesto(String nL, String nV){
        this(nL,0,nV,0,null);
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        this(nL,0,nV,0,f);
    }
    public MarcadorBaloncesto(String nL, int pL, String nVI, int pV, LocalDate fecha){
        this.nombreLocal = nL;
        this.puntosLocal = pL;
        this.nombreVisitante = nVI;
        this.puntosVisitante = pV;
        this.fecha = fecha;
    }
    public void añadirCanasta(char equipo, int puntos){
        if(equipo=='L'){
            this.puntosLocal = puntos>0&&puntos<4 ? puntosLocal+puntos:puntosLocal;
        } else if (equipo=='V') {
            this.puntosVisitante = puntos>0&&puntos<4 ? puntosVisitante+puntos:puntosVisitante;
        }
    }
    public void reset(){
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
}
