package ccv.checkhelzio.filacademica;

import java.util.ArrayList;


public class ListaPonentes {
    private ArrayList<Ponentes> listaPonentes;
    private final int NUMERO_PONENTES = 100;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getPonentes() {
        listaPonentes = new ArrayList<Ponentes>();
        for (int i = 0; i <  NUMERO_PONENTES;i++) {
            listaPonentes.add(new Ponentes(
            //ID
            i
            ));
        }
        return listaPonentes;
    }
}
