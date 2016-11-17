package ccv.checkhelzio.filacademica2015;

import android.util.Log;

import java.util.ArrayList;


public class ListaOrganizadores {
    private ArrayList<Ponentes> listaCoordinadores;
    private int numero_ponentes = 390;


    public ArrayList<Ponentes> getCoordinadorEspecifico(int id) {
        listaCoordinadores = new ArrayList<>();
        for (int x = 1; x < numero_ponentes; x++) {
            try {
                Log.v("numero", "numero: " + x);
                Ponentes P = new Ponentes(x);
                for (int s : P.getEventos_organizador()) {
                    Log.v("numero", "string: " + s);
                    if (s == id) {
                        listaCoordinadores.add(new Ponentes(x));
                    }
                }
            } catch (Exception ignored) {
            }
        }
        return listaCoordinadores;
    }
}
