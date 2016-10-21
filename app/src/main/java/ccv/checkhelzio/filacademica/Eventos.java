package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by check on 19/10/2016.
 */

public class Eventos {
    private int id_evento;
    private int id_cartel;
    private String titulo;
    private String subtitulo;
    private ArrayList<Ponentes> listaCoordinadores;
    private ArrayList<Fecha> listaFecha;
    private String descripcion;

    public Eventos(int id_cartel, String titulo, ArrayList<Ponentes> listaCoordinadores, String subtitulo, String descripcion, ArrayList<Fecha> fechas) {
        this.id_cartel = id_cartel;
        this.titulo = titulo;
        this.listaCoordinadores = listaCoordinadores;
        this.subtitulo = subtitulo;
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

    public String getSubtitulo() {return subtitulo;}

    public void setSubtitulo(String subtitulo) {this.subtitulo = subtitulo;}

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

    public int getId_evento() {return id_evento;}

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public ArrayList<Ponentes> getListaCoordinadores() {return listaCoordinadores;}

    public void setListaCoordinadores(ArrayList<Ponentes> listaCoordinadores) {this.listaCoordinadores = listaCoordinadores;}
}
