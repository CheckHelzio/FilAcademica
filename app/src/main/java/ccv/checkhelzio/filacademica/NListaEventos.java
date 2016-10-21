package ccv.checkhelzio.filacademica;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by FICG on 19/10/2016.
 */

public class NListaEventos {
    private ArrayList<Eventos> listaEventos;
    protected ArrayList<Fecha> listaF;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Eventos> getEventos() {
        listaEventos = new ArrayList<Eventos>();

        // CODIGO DE MUESTRA PARA REGISTRAR UN EVENTO
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                1,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("Salón 6, planta baja, Expo Guadalajara", "27/11/16", "17:30", "18:50"),
                        new Fecha("Salón 6, planta baja, Expo Guadalajara", "27/11/16", "19:30", "21:15")
                )
        ));
        return listaEventos;
    }

    private ArrayList<Fecha> crearFechas(Fecha... datos){
        Collections.addAll(listaF, datos);
        return listaF;
    }
}
