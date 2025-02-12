package Ejercicio34;

import java.time.LocalTime;

public class Reloj {
    private LocalTime hora;
    public Reloj(LocalTime h){
        this.hora = h;
    }
    public Reloj(){
        this.hora = LocalTime.now();
    }
    /*public LocalTime getHora(){
        return this.hora.
    }*/
}
