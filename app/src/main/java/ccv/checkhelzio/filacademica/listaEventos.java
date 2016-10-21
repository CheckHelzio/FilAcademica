package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by FICG on 19/10/2016.
 */

public class listaEventos {
    private ArrayList<Eventos> listaEventos;
    protected ArrayList<Fecha> listaF;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getEventos() {
        listaEventos = new ArrayList<Eventos>();

        // CODIGO DE MUESTRA PARA REGISTRAR UN EVENTO
        listaEventos.add(new Eventos(
                // TITULO
                "Coloquio Gobernanza y Democracia en América Latina",
                // SUBTITULO
                "Carta Democrática",
                // LISTA DE COORDINADORES
                // ...
                // LISTA DE FECHAS
                crearFechas(new Fecha("","",""),
                        new Fecha()));
                // DESCRIPCION DEL EVENTO



        );

        return listaEventos;
    }

    private void crearFechas(Fecha... datos){
        listaF.add(new Fecha());

    }


}
