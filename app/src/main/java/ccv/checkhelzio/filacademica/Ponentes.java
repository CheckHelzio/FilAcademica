package ccv.checkhelzio.filacademica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by FICG on 19/10/2016.
 */

public class Ponentes {
    private int id_ponente;
    private String nombre;
    private String apellidos;
    private String universidad;
    private String profesion;
    private String descripcion;
    private ArrayList<Integer> eventos;
    private ArrayList<Integer> eventos_organizador;


    public Ponentes(int id_ponente) {
        this.id_ponente = id_ponente;
        setDatos(id_ponente);
    }

    public int getId_ponente() {
        return id_ponente;
    }

    public void setId_ponente(int id_ponente) {
        this.id_ponente = id_ponente;
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

    public ArrayList<Integer> getEventos() {return eventos;}

    public void setEventos(ArrayList<Integer> eventos) {this.eventos = eventos;}

    public ArrayList<Integer> getEventos_organizador() {return eventos_organizador;}

    public void setEventos_organizador(ArrayList<Integer> eventos_organizador) {this.eventos_organizador = eventos_organizador;}

    public void setDatos(int id){
        switch(id){
            case 1:
                this.nombre = "Mara";
                this.apellidos = "Robles";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(1,4,34,31));
                this.eventos = new ArrayList<Integer>(Arrays.asList(0));
                break;
            case 2:
                this.nombre = "Beatriz";
                this.apellidos = "Paredes";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<Integer>(Arrays.asList(1,2));
                break;
        }
    }
}
