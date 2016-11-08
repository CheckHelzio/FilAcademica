package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by FICG on 28/10/2016.
 */

public class ListasSedes {
        private ArrayList<Sedes> listaSedes = new ArrayList<>();


    public ListasSedes() {
        listaSedes.add(new Sedes("Expo Guadalajara", "Av. Mariano Otero #1499", 20.6536177, -103.3912453));
        listaSedes.add(new Sedes("Hotel Hilton", "Av. de la Rosas #2933, Rincon del Bosque", 20.6539208, -103.389741));
        listaSedes.add(new Sedes("CUCSH La Normal", "Calle Guanajuato #1045, Alcalde Barranquitas.", 20.694322, -103.34933));
        listaSedes.add(new Sedes("CUCSH Belenes", "Prol. Parres Arias #150, San José del Bajío, Zapopan", 20.7407378, -103.3809367));
        listaSedes.add(new Sedes("Auditorio Tenamaxtle, El Colegio de Jalisco ", "Calle 5 de Mayo #321, Zapopan", 20.7194854, -103.3887629));
        listaSedes.add(new Sedes("Fiesta Americana", "Avenida Providencia entre Avenida las Americas", 20.7025495, -103.3772636));
    }

    public ArrayList<Sedes> getListaSedes(){
        return listaSedes;
    }
}
