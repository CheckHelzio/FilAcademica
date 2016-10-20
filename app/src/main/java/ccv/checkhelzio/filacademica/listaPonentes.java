package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by FICG on 19/10/2016.
 */

public class listaPonentes {
    private ArrayList<Ponentes> listaPonentes;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getPonentes() {
        listaPonentes = new ArrayList<Ponentes>();
        listaPonentes.add(new Ponentes(

                1,

                "Ricardo",

                "Lagos","","",""));

        return listaPonentes;
    }
}
