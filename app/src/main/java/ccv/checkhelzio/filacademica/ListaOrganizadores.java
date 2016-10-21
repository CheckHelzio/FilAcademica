package ccv.checkhelzio.filacademica;

import java.util.ArrayList;


public class ListaOrganizadores {
    private ArrayList<Ponentes> listaOrganizadores;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getPonentes() {
        listaOrganizadores = new ArrayList<Ponentes>();
        listaOrganizadores.add(new Ponentes(
        //ID
            1,
        //Nombre
            "Ricardo",
        //Apellidos
            "Lagos",
                "","","", new ArrayList<Integer>(new int[]{1}));

        return listaOrganizadores;
    }
}
