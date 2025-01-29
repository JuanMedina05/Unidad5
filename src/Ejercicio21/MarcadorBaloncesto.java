package Ejercicio21;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
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
        if((equipo!='V' && equipo!='L')){
            throw new IllegalArgumentException("Parametro de letra de equipo incorrecto");
        } else if (puntos<1||puntos>4) {
            throw new IllegalArgumentException("Parametro de puntos incorrecto");
        } else {
            if (equipo == 'L') {
                this.puntosLocal = puntos > 0 && puntos < 4 ? puntosLocal + puntos : puntosLocal;
            } else if (equipo == 'V') {
                this.puntosVisitante = puntos > 0 && puntos < 4 ? puntosVisitante + puntos : puntosVisitante;
            }
        }
    }
    public void reset(){
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
    public int getPuntosLocal(){
        return this.puntosLocal;
    }
    public int getPuntosVisitante(){
        return this.puntosVisitante;
    }
    public boolean ganaLocal(){
        return puntosLocal>puntosVisitante ? true:false;
    }
    public boolean ganaVisitante(){
        return puntosLocal<puntosVisitante ? true:false;
    }
    public boolean hayEmpate(){
        return puntosLocal==puntosVisitante ? true:false;
    }
    public void guardar(String ruta) throws IOException{
        PrintWriter p = new PrintWriter(ruta);
        p.println(this.nombreLocal+":"+this.puntosLocal+"-"+this.nombreVisitante+":"+this.puntosVisitante);
    }
}
