package ccv.checkhelzio.filacademica;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by check on 19/10/2016.
 */

public class Eventos implements Parcelable {
    private int id_evento;
    private int id_cartel;
    private String titulo;
    private String subtitulo;
    private ArrayList<Ponentes> listaCoordinadores;
    private ArrayList<Fecha> listaFecha;
    private String descripcion;

    public Eventos(int id_evento, ArrayList<Fecha> fechas) {
        this.id_evento = id_evento;
        setDatos(id_evento);
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

    public int getId_evento() {return id_evento;}

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public ArrayList<Ponentes> getListaCoordinadores() {return listaCoordinadores;}

    public void setListaCoordinadores(ArrayList<Ponentes> listaCoordinadores) {this.listaCoordinadores = listaCoordinadores;}

    public void setDatos(int datos) {
        switch (datos){
            case 1:
                this.id_cartel =  R.drawable.cartel1;
                this.titulo = "Coloquio Gobernanza y Democracia en América Latina";
                this.subtitulo = "Carta Democrática";
                this.descripcion = "";
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 30:
                break;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id_evento);
        dest.writeInt(this.id_cartel);
        dest.writeString(this.titulo);
        dest.writeString(this.subtitulo);
        dest.writeList(this.listaCoordinadores);
        dest.writeList(this.listaFecha);
        dest.writeString(this.descripcion);
    }

    protected Eventos(Parcel in) {
        this.id_evento = in.readInt();
        this.id_cartel = in.readInt();
        this.titulo = in.readString();
        this.subtitulo = in.readString();
        this.listaCoordinadores = new ArrayList<Ponentes>();
        in.readList(this.listaCoordinadores, Ponentes.class.getClassLoader());
        this.listaFecha = new ArrayList<Fecha>();
        in.readList(this.listaFecha, Fecha.class.getClassLoader());
        this.descripcion = in.readString();
    }

    public static final Parcelable.Creator<Eventos> CREATOR = new Parcelable.Creator<Eventos>() {
        @Override
        public Eventos createFromParcel(Parcel source) {
            return new Eventos(source);
        }

        @Override
        public Eventos[] newArray(int size) {
            return new Eventos[size];
        }
    };
}
