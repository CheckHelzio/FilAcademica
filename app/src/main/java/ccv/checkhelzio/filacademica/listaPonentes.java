package ccv.checkhelzio.filacademica;

import java.util.ArrayList;


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
