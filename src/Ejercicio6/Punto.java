package Ejercicio6;

import java.awt.*;

public class Punto {
    public int x;
    public int y;
    //diferencia del ejercicio:
    // en el caso de que se pase, el punto de va hacia el lado de donde se pasa y no a la esquina derecha
    public Punto(int x, int y){
        int xPantalla = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        int yPantalla = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight());

        this.x = x>0?(x<xPantalla?x:xPantalla):0;
        this.y = y>0?(y<yPantalla?y:yPantalla):0;
    }
    public Punto(Punto p){
        this.x = p.x/2;
        this.y = p.y/2;
    }
    public Punto(double angulo, double distancia){
        this.x = (int)(distancia*Math.cos(Math.toRadians(angulo)));
        this.y = (int)(distancia*Math.sin(Math.toRadians(angulo)));
    }
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
}
