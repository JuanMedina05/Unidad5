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
    public LocalTime getHora(){
        return this.hora;
    }
    public void añadir(int segundos){
        this.hora = this.hora.plusSeconds((long)segundos);
    }
    public boolean esNoche(){
        return this.hora.isAfter(LocalTime.of(19,59))||this.hora.isBefore(LocalTime.of(7,59));

    }
    public void esperar(int segundo) throws InterruptedException {
        Thread.sleep(segundo*1000);
    }
    public String toString(){
        return this.hora.getHour()+":"+this.hora.getMinute()+":"+(this.hora.getSecond()>9 ? this.hora.getSecond():0+""+this.hora.getSecond());
    }
}
