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

    public Fecha(String id, int id_Sede, String fecha, String hora_inicial, String hora_final) {
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

        setSede(id_Sede);
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

    public void setSede(int nombreSede) {
        Sedes mSede = null;
        switch (nombreSede){
            case 1:
                mSede = new Sedes("Salón 1, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 2:
                mSede = new Sedes("Salón 2, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 3:
                mSede = new Sedes("Salón 3, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 4:
                mSede = new Sedes("Salón 4, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 5:
                mSede = new Sedes("Salón 5, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 6:
                mSede = new Sedes("Salón 6, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 7:
                mSede = new Sedes("Salón Juan Rulfo, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 8:
                mSede = new Sedes("Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 9:
                mSede = new Sedes("Salón Salón Elías Nandino, planta baja, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 10:
                mSede = new Sedes("Salón E, Área Internacional, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 11:
                mSede = new Sedes("Salón José Luis Martínez, planta alta, Expo Guadalajara", "Av. Mariano Otero #1499", 20.6540891, -103.3939701);
                break;
            case 12:
                mSede = new Sedes("Hotel Hilton", "Av. de la Rosas #2933, Rincon del Bosque", 20.665237, -103390012);
                break;
            case 13:
                mSede = new Sedes("Auditorio Silvano Barba, CUCSH", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case 14:
                mSede = new Sedes("Sala de Juicios orales Mariano Otero, CUCSH", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case 15:
                mSede = new Sedes("Auditorio Adalberto Navarro Sánchez, CUCSH", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case 16:
                mSede = new Sedes("Auditorio Carlos Ramírez, CUCSH", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case 17:
                mSede = new Sedes("Aula Magna del Edificio de Derecho, CUCSH", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos", 20.694322, -103.34933);
                break;
            case 18:
                mSede = new Sedes("Auditorio Fernando Pozos, primer piso, CUCSH Belenes", "Prol. Parres Arias #150, San José del Bajío,Zapopan,", 20.7407378, -103.3809367);
                break;
        }
        this.sede = mSede;
    }
}
