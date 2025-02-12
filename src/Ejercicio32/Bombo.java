package Ejercicio32;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {
    private Queue<Bola> bolas;
    public Bombo(int totalBolas){
        this.bolas = new ArrayDeque<>(totalBolas);
        Random r = new Random();
        for(int i = 0;i<totalBolas;i++){
            this.bolas.add(new Bola(1+r.nextInt(100)));
        }
    }
    public int getNumeroBolas(){
        return this.bolas.size();
    }
    public Bola sacarBola(){
        this.bolas.remove();
        return this.bolas.peek();
    }

}
