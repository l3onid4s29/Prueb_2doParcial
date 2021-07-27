package relaciones;

import java.util.ArrayList;

public class Facultad {

    private String nombreFacultad;

    private Director director; 
    private ArrayList<Carrera> carrera = new ArrayList<>(); 
    private ArrayList<Profesor> profesor = new ArrayList<>(); 

    public Facultad(String tipoDeFacultad, Director director) {
        this.nombreFacultad = nombreFacultad;
        this.director = director;
    }

    public void addCarrera(Carrera carrera1) {
        carrera.add(carrera1);
    }

    public void agregaProfesor(Profesor profesor1) {
        profesor.add(profesor1);
    }
}
