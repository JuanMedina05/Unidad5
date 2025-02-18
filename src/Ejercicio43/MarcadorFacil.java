package Ejercicio43;

public class MarcadorFacil implements MarcadorBaloncesto{
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    public MarcadorFacil(String local, String visitante){
        this.nombreEquipoLocal = local;
        this.nombreEquipoVisitante = visitante;
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if(e.equals(TipoEquipo.LOCAL)){
            this.puntosLocal += t.getValor();
        } else if (e.equals(TipoEquipo.VISITANTE)){
            this.puntosVisitante += t.getValor();
        }
    }

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        return e.equals(TipoEquipo.LOCAL) ? this.nombreEquipoLocal:this.nombreEquipoVisitante;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        return e.equals(TipoEquipo.LOCAL) ? this.puntosLocal:this.puntosVisitante;

    }
}
