package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by FICG on 19/10/2016.
 */

public class Ponentes {
    private int id;
    private String nombre;
    private String apellidos;
    private String universidad;
    private String profesion;
    private String descripcion;
    private ArrayList<Integer> eventos;


    public Ponentes(int id, String nombre, String apellidos, String universidad, String profesion, String descripcion, ArrayList<Integer> eventos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.universidad = universidad;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.eventos = eventos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
