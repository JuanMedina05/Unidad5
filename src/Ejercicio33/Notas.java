package Ejercicio33;

import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Double> notas;
    public Notas(){
        this.notas = new ArrayList<>();
    }
    public void añadirNota(double n){
        this.notas.add(n);
    }
    public int getTotalNotas(){
        return this.notas.size();
    }
    public double calcularNotaMedia(){
        if(getTotalNotas()==0){
            throw new IllegalStateException("no hay notas para calcular la media");
        }else {
            double aux = 0;
            for (double i : this.notas) {
                aux += i;
            }
            return aux / getTotalNotas();
        }
    }
    public double calcularNotaMaxima(){
        if(getTotalNotas()==0){
            throw new IllegalStateException("no hay notas para calcular la media");
        }else {
            double aux = 0;
            for (double i : this.notas) {
                aux = i > aux ? i : aux;
            }
            return aux;
        }
    }
}
