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
                4,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 7, "30/11/16", "19:30", "20:50")
                )
        ));
        /////////////////////////////////
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                34,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 3, "03/12/16", "10:00", "10:50"),
                        new Fecha("B", 3, "03/12/16", "11:00", "11:50"),
                        new Fecha("C", 3, "03/12/16", "12:00", "12:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                5,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 3, "03/12/16", "13:00", "13:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                6,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 2, "01/12/16", "18:00", "19:20")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                7,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 2, "28/11/16", "19:00", "19:50")
                )
        ));
        ///////////////FALTA 8
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                9,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 9, "30/11/16", "13:00", "14:00"),
                        new Fecha("B", 9, "30/11/16", "16:00", "17:00"),
                        new Fecha("C", 9, "30/11/16", "17:30", "18:30"),
                        new Fecha("D", 9, "01/12/16", "10:00", "11:00"),
                        new Fecha("E", 9, "01/12/16", "11:30", "12:30"),
                        new Fecha("F", 9, "01/12/16", "13:00", "14:00"),
                        new Fecha("G", 9, "01/12/16", "16:00", "17:00"),
                        new Fecha("H", 9, "02/12/16", "10:00", "11:00"),
                        new Fecha("I", 9, "02/12/16", "11:30", "12:30"),
                        new Fecha("J", 9, "02/12/16", "13:00", "14:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                10,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 7, "02/12/16", "20:00", "20:15"),
                        new Fecha("B", 7, "02/12/16", "20:15", "20:30"),
                        new Fecha("C", 7, "02/12/16", "20:30", "20:45"),
                        new Fecha("D", 7, "02/12/16", "20:45", "21:15")
                )
        ));

        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                11,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 7, "03/12/16", "18:00", "19:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                12,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 6, "29/11/16", "19:00", "21:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                13,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 3, "28/11/16", "18:00", "18:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                14,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 7, "27/11/16", "19:00", "20:50")
                )
        ));
        /////////////////////////////////
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                31,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 4, "03/12/16", "10:00", "10:50"),
                        new Fecha("B", 4, "03/12/16", "11:00", "11:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                15,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 1, "01/12/16", "13:00", "14:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                16,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 2, "02/12/16", "10:00", "10:20"),
                        new Fecha("B", 2, "02/12/16", "10:25", "11:50"),
                        new Fecha("C", 2, "02/12/16", "12:00", "13:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                17,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 14, "01/12/16", "09:00", "11:00"),
                        new Fecha("B", 14, "01/12/16", "11:00", "13:00"),
                        new Fecha("C", 14, "02/12/16", "09:00", "11:00"),
                        new Fecha("D", 14, "02/12/16", "11:00", "13:00"),
                        new Fecha("E", 14, "02/12/16", "13:00", "15:00"),
                        new Fecha("F", 2, "03/12/16", "12:00", "12:50"),
                        new Fecha("G", 2, "02/12/16", "12:00", "13:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                32,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 16, "25/11/16", "8:30", "10:20"),
                        new Fecha("B", 16, "25/11/16", "10:20", "10:50"),
                        new Fecha("C", 16, "25/11/16", "10:50", "11:20"),
                        new Fecha("D", 16, "25/11/16", "12:00", "12:30"),
                        new Fecha("E", 16, "25/11/16", "12:30", "13:00"),
                        new Fecha("F", 16, "25/11/16", "13:00", "13:30"),
                        new Fecha("G", 16, "25/11/16", "15:30", "16:00"),
                        new Fecha("H", 16, "25/11/16", "16:00", "16:30"),
                        new Fecha("I", 16, "25/11/16", "16:30", "17:00"),
                        new Fecha("J", 16, "25/11/16", "18:00", "19:00"),
                        new Fecha("K", 10, "28/11/16", "20:00", "20:50"),
                        new Fecha("L", 14, "29/11/16", "10:00", "14:00"),
                        new Fecha("M", 14, "29/11/16", "14:00", "15:00"),
                        new Fecha("N", 15, "30/11/16", "11:00", "13:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                18,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 16, "30/11/16", "16:00", "18:00"),
                        new Fecha("B", 20, "30/11/16", "19:00", "19:50"),
                        new Fecha("C", 7, "01/12/16", "10:00", "12:00"),
                        new Fecha("D", 7, "01/12/16", "19:00", "19:50"),
                        new Fecha("E", 21, "02/12/16", "11:00", "11:50"),
                        new Fecha("F", 22, "02/12/16", "12:00", "14:00"),
                        new Fecha("G", 4, "02/12/16", "20:00", "21:00"),
                        new Fecha("H", 21, "03/12/16", "12:00", "14:00"),
                        new Fecha("I", 1, "04/12/16", "18:00", "20:50")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                19,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 13, "28/11/16", "18:00", "21:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                20,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 10, "29/11/16", "09:00", "10:45"),
                        new Fecha("B", 10, "29/11/16", "10:45", "12:00"),
                        new Fecha("C", 10, "29/11/16", "12:00", "12:40"),
                        new Fecha("D", 10, "29/11/16", "12:40", "13:30"),
                        new Fecha("E", 10, "30/11/16", "09:00", "09:30"),
                        new Fecha("F", 10, "30/11/16", "09:30", "10:00"),
                        new Fecha("G", 10, "30/11/16", "10:00", "10:40"),
                        new Fecha("H", 10, "30/11/16", "10:40", "12:00"),
                        new Fecha("I", 10, "30/11/16", "12:00", "13:30")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                21,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 7, "28/11/16", "09:00", "14:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                22,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 13, "29/11/16", "09:30", "12:00"),
                        new Fecha("B", 13, "29/11/16", "12:00", "14:00"),
                        new Fecha("C", 13, "30/11/16", "10:00", "13:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                23,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 5, "30/11/16", "09:00", "10:00"),
                        new Fecha("B", 5, "30/11/16", "10:00", "11:00"),
                        new Fecha("C", 5, "30/11/16", "11:00", "12:00"),
                        new Fecha("D", 5, "30/11/16", "12:15", "13:45"),
                        new Fecha("E", 5, "30/11/16", "13:45", "15:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                24,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 11, "28/11/16", "09:00", "10:30"),
                        new Fecha("B", 11, "28/11/16", "10:45", "13:00"),
                        new Fecha("C", 11, "28/11/16", "13:15", "14:00"),
                        new Fecha("D", 11, "29/11/16", "09:30", "12:00"),
                        new Fecha("E", 11, "29/11/16", "12:15", "12:45")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                25,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 12, "29/11/16", "09:00", "14:00"),
                        new Fecha("B", 12, "29/11/16", "09:00", "09:20"),
                        new Fecha("C", 12, "29/11/16", "09:20", "11:20"),
                        new Fecha("D", 12, "29/11/16", "11:30", "13:40"),
                        new Fecha("E", 12, "29/11/16", "13:40", "14:30"),
                        new Fecha("F", 12, "29/11/16", "14:30", "15:30")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                26,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 13, "03/12/16", "10:00", "14:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                27,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 13, "02/12/16", "09:00", "10:30"),
                        new Fecha("B", 13, "02/12/16", "10:40", "11:40"),
                        new Fecha("C", 13, "02/12/16", "11:50", "12:50"),
                        new Fecha("D", 13, "02/12/16", "13:00", "14:00"),
                        new Fecha("E", 13, "02/12/16", "14:00", "14:30")
                        )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                28,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 13, "29/11/16", "17:00", "18:50"),
                        new Fecha("B", 13, "30/11/16", "11:00", "14:00"),
                        new Fecha("C", 13, "01/12/16", "11:00", "14:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                29,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 19, "28/11/16", "10:00", "10:30"),
                        new Fecha("B", 19, "28/11/16", "10:30", "11:00"),
                        new Fecha("C", 19, "28/11/16", "11:00", "11:30"),
                        new Fecha("D", 19, "28/11/16", "11:30", "12:00"),
                        new Fecha("E", 19, "28/11/16", "12:00", "12:30"),
                        new Fecha("F", 19, "29/11/16", "10:00", "10:30"),
                        new Fecha("G", 19, "29/11/16", "10:30", "11:30"),
                        new Fecha("H", 19, "29/11/16", "11:30", "12:00"),
                        new Fecha("I", 19, "30/11/16", "10:00", "10:30"),
                        new Fecha("J", 19, "30/11/16", "10:30", "11:00"),
                        new Fecha("K", 19, "30/11/16", "11:00", "11:30"),
                        new Fecha("L", 19, "30/11/16", "12:00", "12:30"),
                        new Fecha("M", 19, "30/11/16", "12:30", "13:00"),
                        new Fecha("N", 19, "01/12/16", "10:00", "10:30"),
                        new Fecha("O", 19, "01/12/16", "10:30", "11:00"),
                        new Fecha("P", 19, "01/12/16", "11:00", "11:30"),
                        new Fecha("Q", 19, "01/12/16", "12:00", "12:30"),
                        new Fecha("R", 19, "01/12/16", "12:30", "13:00"),
                        new Fecha("S", 19, "01/12/16", "13:00", "13:30"),
                        new Fecha("T", 19, "02/12/16", "10:00", "10:30"),
                        new Fecha("U", 19, "02/12/16", "10:30", "11:00"),
                        new Fecha("V", 19, "02/12/16", "11:00", "11:30"),
                        new Fecha("W", 19, "02/12/16", "12:00", "12:30"),
                        new Fecha("X", 19, "02/12/16", "12:30", "13:00"),
                        new Fecha("Y", 19, "02/12/16", "13:00", "14:00"),
                        new Fecha("Z", 19, "02/12/16", "14:00", "15:00")
                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                30,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 17, "29/11/16", "09:00", "12:00"),
                        new Fecha("B", 17, "29/11/16", "12:25", "14:00"),
                        new Fecha("C", 17, "29/11/16", "16:00", "17:20"),
                        new Fecha("D", 17, "29/11/16", "17:40", "19:40"),
                        new Fecha("E", 17, "29/11/16", "17:40", "19:40"),
                        new Fecha("F", 18, "30/11/16", "10:00", "12:00"),
                        new Fecha("G", 18, "30/11/16", "12:25", "13:40"),
                        new Fecha("H", 18, "30/11/16", "13:40", "14:00")

                )
        ));
        listaEventos.add(new Eventos(
                //ID DEL EVENTO
                33,
                // LISTA DE FECHAS...
                crearFechas(
                        new Fecha("A", 15, "28/11/16", "13:00", "18:00")
                )
        ));
        return listaEventos;
    }

    private ArrayList<Fecha> crearFechas(Fecha... datos){
        Collections.addAll(listaF, datos);
        return listaF;
    }
}
