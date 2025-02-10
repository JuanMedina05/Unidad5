package Ejercicio28;

public class Matricula {
    public static int siguienteNumeroMatricula = 1;
    private int numeroMatricula;
    private String nombreAlumno;
    private String nombreAsignatura;
    public Matricula(String nombreAlumno, String nombreAsignatura){
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.numeroMatricula = siguienteNumeroMatricula++;
    }
    public String getNombreAlumno(){
        return this.nombreAlumno;
    }
    public String getNombreAsignatura(){
        return this.getNombreAsignatura();
    }
    public int getNumeroMatricula(){
        return this.numeroMatricula;
    }
}
