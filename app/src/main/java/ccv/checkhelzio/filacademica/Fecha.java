package ccv.checkhelzio.filacademica;

import java.util.Calendar;

/**
 * Created by FICG on 19/10/2016.
 */

public class Fecha {
    private String stSede;
    private Calendar fecha_inicial, fecha_final;
    private Sedes sede;

    public Fecha(String sede, String fecha, String hora_inicial, String hora_final) {
        //FORMATO FECHA 19/10/2016.
        String fecha_s [] = fecha.split("/");
        //FORMATO HORA(24 HORAS) 21:00
        String hora_inicial_a [] = hora_inicial.split(":");
        String hora_final_a [] = hora_final.split(":");

        this.fecha_inicial.add(Calendar.YEAR,Integer.parseInt(fecha_s[2]));
        this.fecha_final.add(Calendar.YEAR,Integer.parseInt(fecha_s[2]));
        this.fecha_inicial.add(Calendar.MONTH,Integer.parseInt(fecha_s[1]));
        this.fecha_final.add(Calendar.MONTH,Integer.parseInt(fecha_s[1]));
        this.fecha_inicial.add(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha_s[0]));
        this.fecha_inicial.add(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha_s[0]));

        this.fecha_inicial.add(Calendar.HOUR_OF_DAY,Integer.parseInt(hora_inicial_a[0]));
        this.fecha_inicial.add(Calendar.MINUTE,Integer.parseInt(hora_inicial_a[1]));

        this.fecha_final.add(Calendar.HOUR_OF_DAY,Integer.parseInt(hora_final_a[0]));
        this.fecha_final.add(Calendar.MINUTE,Integer.parseInt(hora_inicial_a[1]));

        setSede(sede);
    }

    public String getStSede() {
        return stSede;
    }

    public void setStSede(String stSede) {
        this.stSede = stSede;
    }

    public Calendar getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Calendar fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Calendar getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Calendar fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Sedes getSede() {
        return sede;
    }

    public void setSede(String sede) {
        Sedes mSede = null;
        switch (sede){
            case "Salón 6, planta baja, Expo Guadalajara":
                mSede = new Sedes(sede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
        }
        this.sede = mSede;
    }
}
