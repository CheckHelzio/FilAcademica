package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by FICG on 19/10/2016.
 */

public class listaEventos {
    private ArrayList<Eventos> listaEventos;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getPonentes() {
        listaEventos = new ArrayList<Eventos>();
        listaEventos.add(new Eventos(
                //TITULO
                "Coloquio Gobernanza y Democracia en América Latina"

        );

        return listaEventos;
    }
}
