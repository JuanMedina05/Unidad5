package SuperEjercicio.test;

import SuperEjercicio.Estado;
import SuperEjercicio.TituloArchivo;
import org.junit.Test;

import static org.junit.Assert.*;

public class TituloArchivoTest {
    @Test
    public void Test1(){
        TituloArchivo t = new TituloArchivo("12345678M","Pepe López","Explotación de Sistemas Informáticos", Estado.RECIBIDO);
        assertEquals("12345678M;Pepe López;Explotación de Sistemas Informáticos;1",t.toString());
    }

}