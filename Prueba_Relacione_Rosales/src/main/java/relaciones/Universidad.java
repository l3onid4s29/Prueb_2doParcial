package relaciones;

import java.util.ArrayList;

public class Universidad {

    private String nomUniversidad;

    private ArrayList<Facultad> facultad; 
    
     public void agregaFacultad(Facultad facultadN) {
        facultad.add(facultadN);
    }

    public Universidad(String nomUniversidad) {
        facultad = new ArrayList<>();
        this.nomUniversidad = nomUniversidad;
    }

   

}
