package SuperEjercicio;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    public abstract List<Titulo> getTitulos();
    public abstract boolean guardar();
    public abstract boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);
    default Titulo getTitulo(String dni){
        for(Titulo t:this.getTitulos()){
            if(t.getDNI().equals(dni)){
                return t;
            }
        }
        throw new NoSuchElementException("Datos erroneos");
    }
}
