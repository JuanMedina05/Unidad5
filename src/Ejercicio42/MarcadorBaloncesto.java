package Ejercicio42;

public interface MarcadorBaloncesto {
    public void añadirCanasta(TipoEquipo e, TipoCanasta t);
    public abstract String getNombreEquipo(TipoEquipo e);
    int getPuntos(TipoEquipo e);
    default String getMarcador(){
        return getNombreEquipo(TipoEquipo.LOCAL)+" "+getPuntos(TipoEquipo.LOCAL)+"-"+getNombreEquipo(TipoEquipo.VISITANTE)+" "+getPuntos(TipoEquipo.VISITANTE);
    }
}
