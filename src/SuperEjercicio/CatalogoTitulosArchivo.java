package SuperEjercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CatalogoTitulosArchivo implements CatalogoTitulos{
    private String ruta;
    private List<Titulo> titulos;
    public CatalogoTitulosArchivo(String ruta) throws IOException {
        this.ruta = ruta;
        File f = new File(ruta);
        if(f.isFile()){
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            while(bf.readLine()!=null){
                this.titulos.add(getTitulo(bf.readLine().substring(0,9)));
            }
        }else{
            f.createNewFile();
        }
    }
    public static Titulo extraerTitulo(String linea){
        return new TituloArchivo()
    }

    @Override
    public List<Titulo> getTitulos() {
        return List.of();
    }

    @Override
    public boolean guardar() {
        return false;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        return false;
    }

    @Override
    public Titulo getTitulo(String dni) {
        return CatalogoTitulos.super.getTitulo(dni);
    }
}
