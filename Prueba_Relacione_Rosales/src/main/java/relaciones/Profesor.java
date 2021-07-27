package relaciones;

import java.util.ArrayList;

public class Profesor {

    private String nomProfesor;

    private ArrayList<Materia> materia = new ArrayList<>(); 

    public void agregaMateria(Materia materiaN) {
        materia.add(materiaN);
    }
}
