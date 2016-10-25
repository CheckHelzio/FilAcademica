package ccv.checkhelzio.filacademica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by FICG on 19/10/2016.
 */

public class ListaEventos {
    private ArrayList<Eventos> listaEventos;
    protected ArrayList<Fecha> listaF;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Eventos> getEventos() {
        listaEventos = new ArrayList<Eventos>();
        listaF = new ArrayList<Fecha>();

        // CODIGO DE MUESTRA PARA REGISTRAR UN EVENTO
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                1,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 6, "27/11/16", "17:00", "17:40"),
                        new Fecha("B",6, "27/11/16", "17:45", "18:30"),
                        new Fecha("C",6, "27/11/16", "18:35", "19:20"),
                        new Fecha("D",6, "27/11/16", "19:25", "20:05"),
                        new Fecha("E",6, "27/11/16", "20:10", "20:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                2,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 3, "27/11/16", "18:00", "19:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                3,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 2, "01/12/16", "19:30", "21:00"),
                        new Fecha("A", 2, "02/12/16", "19:30", "21:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                34,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 3, "03/12/16", "10:00", "10:50"),
                        new Fecha("B", 3, "03/12/16", "11:00", "11:50"),
                        new Fecha("C", 3, "03/12/16", "11:00", "11:50")
                )
        ));
        return listaEventos;
    }

    private ArrayList<Fecha> crearFechas(Fecha... datos){
        Collections.addAll(listaF, datos);
        return listaF;
    }
}
