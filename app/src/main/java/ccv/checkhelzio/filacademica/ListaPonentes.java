package ccv.checkhelzio.filacademica;

import android.util.Log;

import java.util.ArrayList;


public class ListaPonentes {
    private ArrayList<Ponentes> listaPonentes;
    private int numero_ponentes = 404;

    //FUNCION PARA REGRESAR TODOS LOS PONENTES
    public ArrayList<Ponentes> getAllPonentes() {
        listaPonentes = new ArrayList<Ponentes>();
        for (int x = 0; x < numero_ponentes; x++){
            listaPonentes.add(new Ponentes(x));
        }
        return listaPonentes;
    }

    public ArrayList<Ponentes> getPonenteEspecifico(String letra) {
        Log.v("numero", "LETRA: " + letra);
        listaPonentes = new ArrayList<>();
        for (int x = 1; x < numero_ponentes; x++){
            try {
                Log.v("numero", "numero: " + x);
                Ponentes P = new Ponentes(x);
                for (String s : P.getEventos()){
                    Log.v("numero", "string: " + s);
                    if (s.equals(letra)){
                        listaPonentes.add(new Ponentes(x));
                    }
                }
            }catch (Exception ignored){}
        }
        return listaPonentes;
    }

    public ArrayList<Ponentes> getPonenteEspecifico2(int id_evento) {
        listaPonentes = new ArrayList<>();
        for (int x = 1; x < numero_ponentes; x++){
            try {
                Log.v("numero", "numero: " + x);
                Ponentes P = new Ponentes(x);
                for (String s : P.getEventos()){
                    Log.v("numero", "string: " + s);
                    if (s.matches("" + id_evento + "[A-Z]+")){
                        listaPonentes.add(new Ponentes(x));
                    }
                }
            }catch (Exception ignored){}
        }
        return listaPonentes;
    }
}
