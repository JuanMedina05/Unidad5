package Ejercicio40;

public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    public DepositoAguaInmutable{
        if(capacidadMaxima<=0 || capacidadActual<=0 || capacidadActual>capacidadMaxima){
            throw new IllegalArgumentException("Valores incorrectos");
        }
    }
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
        if(capacidadMaxima<0){
            throw new IllegalArgumentException("Valores incorrectos");
        }
    }
    public DepositoAguaInmutable añadirLitro(){
        return new DepositoAguaInmutable(this.capacidadActual+1,this.capacidadMaxima);
    }
    public DepositoAguaInmutable retirarLitro(){
        return new DepositoAguaInmutable(this.capacidadActual-1,this.capacidadMaxima());
    }
    public int getPorcentaje(){
        return this.capacidadActual*100/this.capacidadMaxima;
    }
}
