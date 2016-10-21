package ccv.checkhelzio.filacademica;

import java.util.ArrayList;


public class ListaPonentes {
    private ArrayList<Ponentes> listaPonentes;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getPonentes() {
        listaPonentes = new ArrayList<Ponentes>();
        listaPonentes.add(new Ponentes(
                //ID
                1,
                //Nombre
                "Ricardo",
                //Apellidos
                "Lagos",
                "","","", new ArrayList<Integer>(new int[]{1}));

        return listaPonentes;
    }
}
