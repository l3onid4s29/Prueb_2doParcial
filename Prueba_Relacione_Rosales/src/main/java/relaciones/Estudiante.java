package relaciones;

import java.util.ArrayList;

public class Estudiante {

    private String nombreEstudiante;

    private ArrayList<Materia> materia = new ArrayList<>(); 

    public void agregaMateria(Materia materiaN) {
        
        materia.add(materiaN);
    }
}
