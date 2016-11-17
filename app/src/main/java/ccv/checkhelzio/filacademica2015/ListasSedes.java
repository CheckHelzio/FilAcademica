package ccv.checkhelzio.filacademica2015;

import java.util.ArrayList;

/**
 * Created by FICG on 28/10/2016.
 */

public class ListasSedes {
        private ArrayList<Sedes> listaSedes = new ArrayList<>();


    public ListasSedes() {
        listaSedes.add(new Sedes("Expo Guadalajara", "Av. Mariano Otero #1499, Verde Valle, Guadalajara, Jal.", 20.6536177, -103.3912453));
        listaSedes.add(new Sedes("Hotel Hilton", "Av. de la Rosas #2933, Rincon del Bosque, Guadalajara, Jal.", 20.6539208, -103.389741));
        listaSedes.add(new Sedes("CUCSH La Normal", "Calle Guanajuato #1045, Alcalde Barranquita, Artesanos, Guadalajara, Jal.", 20.694322, -103.34933));
        listaSedes.add(new Sedes("CUCSH Belenes", "Prol. Parres Arias #150, San José del Bajío, Zapopan, Jal.", 20.7407378, -103.3809367));
        listaSedes.add(new Sedes("Auditorio Tenamaxtle, El Colegio de Jalisco ", "Calle 5 de Mayo #321, Zapopan, Jal.", 20.7194854, -103.3887629));
        listaSedes.add(new Sedes("Grand Fiesta Americana", "Av. Américas #1551, Colonia Providencia, Guadalajara, Jal.", 20.7025495, -103.3772636));
        listaSedes.add(new Sedes("Museo de las Artes de la Universidad de Guadalajara", "Calle Juárez #975, Colonia Centro, Guadalajara, Jal.", 20.6744152, -103.3589414));
    }

    public ArrayList<Sedes> getListaSedes(){
        return listaSedes;
    }
}
