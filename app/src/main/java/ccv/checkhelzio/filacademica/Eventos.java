package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by check on 19/10/2016.
 */

public class Eventos {
    private int id_cartel;
    private String titulo;
    private String descripcion;
    private ArrayList<Fecha> fechas;

    public Eventos(int id_cartel, String titulo, String descripcion, ArrayList<Fecha> fechas) {
        this.id_cartel = id_cartel;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechas = fechas;
    }

    public int getId_cartel() {
        return id_cartel;
    }

    public void setId_cartel(int id_cartel) {
        this.id_cartel = id_cartel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Fecha> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<Fecha> fechas) {
        this.fechas = fechas;
    }


}
