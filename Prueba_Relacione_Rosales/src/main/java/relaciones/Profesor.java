package relaciones;

import java.util.ArrayList;

public class Profesor {

    private String nomProfesor;

    private ArrayList<Materia> materia = new ArrayList<>(); 

    public void addMateria(Materia materiaN) {
        materia.add(materiaN);
    }
}
