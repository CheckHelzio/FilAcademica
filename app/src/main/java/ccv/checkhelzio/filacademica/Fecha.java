package ccv.checkhelzio.filacademica;

import java.util.Calendar;

/**
 * Created by FICG on 19/10/2016.
 */

public class Fecha {
    private Calendar cal_fecha_ini, cal_fecha_fin;
    private Sedes sede;
    String id = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha(String id, String nombreSede, String fecha, String hora_inicial, String hora_final) {
        //FORMATO FECHA 19/10/2016.
        String fecha_s [] = fecha.split("/");
        //FORMATO HORA(24 HORAS) 21:00
        String hora_inicial_a [] = hora_inicial.split(":");
        String hora_final_a [] = hora_final.split(":");

        cal_fecha_ini = Calendar.getInstance();
        cal_fecha_fin = Calendar.getInstance();
        this.cal_fecha_ini.add(Calendar.YEAR, Integer.parseInt(fecha_s[2]));
        this.cal_fecha_fin.add(Calendar.YEAR,Integer.parseInt(fecha_s[2]));
        this.cal_fecha_ini.add(Calendar.MONTH,Integer.parseInt(fecha_s[1]));
        this.cal_fecha_fin.add(Calendar.MONTH,Integer.parseInt(fecha_s[1]));
        this.cal_fecha_ini.add(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha_s[0]));
        this.cal_fecha_ini.add(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha_s[0]));
        this.cal_fecha_ini.add(Calendar.HOUR_OF_DAY,Integer.parseInt(hora_inicial_a[0]));
        this.cal_fecha_ini.add(Calendar.MINUTE,Integer.parseInt(hora_inicial_a[1]));

        this.cal_fecha_fin.add(Calendar.HOUR_OF_DAY,Integer.parseInt(hora_final_a[0]));
        this.cal_fecha_fin.add(Calendar.MINUTE,Integer.parseInt(hora_inicial_a[1]));

        this.id = id;

        setSede(nombreSede);
    }

    public Calendar getcal_fecha_ini() {
        return cal_fecha_ini;
    }

    public void setcal_fecha_ini(Calendar cal_fecha_ini) {
        this.cal_fecha_ini = cal_fecha_ini;
    }

    public Calendar getcal_fecha_fin() {
        return cal_fecha_fin;
    }

    public void setcal_fecha_fin(Calendar cal_fecha_fin) {
        this.cal_fecha_fin = cal_fecha_fin;
    }

    public Sedes getSede() {
        return sede;
    }

    public void setSede(String nombreSede) {
        Sedes mSede = null;
        switch (nombreSede){
            case "Salón 1, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón 2, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón 3, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón 4, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón 5, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón 6, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón Juan Rulfo, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón Salón Elías Nandino, planta baja, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón E, Área Internacional, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Salón José Luis Martínez, planta alta, Expo Guadalajara":
                mSede = new Sedes(nombreSede, "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case "Hotel Hilton":
                mSede = new Sedes(nombreSede, "Av. de la Rosas #2933, Rincon del Bosque", 20.665237, -103390012);
                break;
            case "Auditorio Silvano Barba, CUCSH":
                mSede = new Sedes(nombreSede, "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case "Sala de Juicios orales Mariano Otero, CUCSH":
                mSede = new Sedes(nombreSede, "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case "Auditorio Adalberto Navarro Sánchez, CUCSH":
                mSede = new Sedes(nombreSede, "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case "Auditorio Carlos Ramírez, CUCSH":
                mSede = new Sedes(nombreSede, "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case "Aula Magna del Edificio de Derecho, CUCSH":
                mSede = new Sedes(nombreSede, "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case "Auditorio Fernando Pozos, primer piso, CUCSH Belenes":
                mSede = new Sedes(nombreSede, "Prol. Parres Arias #150, San José del Bajío,Zapopan,", 20.7407378, -103.3809367);
                break;
        }
        this.sede = mSede;
    }
}
