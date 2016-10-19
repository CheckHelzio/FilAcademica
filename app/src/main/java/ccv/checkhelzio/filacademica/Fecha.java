package ccv.checkhelzio.filacademica;

import java.util.Calendar;

/**
 * Created by FICG on 19/10/2016.
 */

public class Fecha {
    private String sede;
    private Calendar fecha;

    public Fecha(String sede, String fecha, String hora) {
        //FORMATO FECHA 19/10/2016
        String fecha_s [] = fecha.split("/");
        //FORMATO HORA(24 HORAS) 21:00
        String hora_s [] = hora.split(":");

        this.sede = sede;
        this.fecha.add(Calendar.YEAR,Integer.parseInt(fecha_s[2]));
        this.fecha.add(Calendar.MONTH,Integer.parseInt(fecha_s[1]));
        this.fecha.add(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha_s[0]));
        this.fecha.add(Calendar.HOUR_OF_DAY,Integer.parseInt(hora_s[0]));
        this.fecha.add(Calendar.MINUTE,Integer.parseInt(hora_s[1]));

    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
}
