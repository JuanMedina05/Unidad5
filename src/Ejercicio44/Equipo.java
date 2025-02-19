package Ejercicio44;

public record Equipo(String nombre, int puntos) {
    public Equipo{
        if(puntos<0){
            throw new IllegalArgumentException("Puntos negativos");
        }
    }
    public Equipo(String nombre){
        this(nombre,0);
    }
    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(this.nombre, this.puntos+t.getValor());
    }
}
