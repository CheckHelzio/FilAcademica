package ccv.checkhelzio.filacademica;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by check on 19/10/2016.
 */

public class Sedes implements Parcelable {
    private String nombre;
    private String direccion;
    private double longitud;
    private double latitud;

    public Sedes(String nombre, String direccion, double longitud, double latitud) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeString(this.direccion);
        dest.writeDouble(this.longitud);
        dest.writeDouble(this.latitud);
    }

    protected Sedes(Parcel in) {
        this.nombre = in.readString();
        this.direccion = in.readString();
        this.longitud = in.readDouble();
        this.latitud = in.readDouble();
    }

    public static final Parcelable.Creator<Sedes> CREATOR = new Parcelable.Creator<Sedes>() {
        @Override
        public Sedes createFromParcel(Parcel source) {
            return new Sedes(source);
        }

        @Override
        public Sedes[] newArray(int size) {
            return new Sedes[size];
        }
    };
}
