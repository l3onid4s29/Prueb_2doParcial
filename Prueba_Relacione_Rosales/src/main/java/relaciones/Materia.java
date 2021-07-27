package relaciones;

import java.util.ArrayList;

public class Materia {

    private String nomMateria;

    private Profesor profesorN; 
    private ArrayList<Estudiante> estudianteN = new ArrayList<>(); 
    
      public Materia(String nombMateria, Profesor profesor) {
        this.nomMateria = nombMateria;
        this.profesorN = profesor;
    }
    
    public void addEstudiante(Estudiante carrera1) {
        estudianteN.add(carrera1);
    }  
}
