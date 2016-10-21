package ccv.checkhelzio.filacademica.sqlite;

import android.content.ContentValues;
import android.provider.BaseColumns;

import java.util.ArrayList;

import ccv.checkhelzio.filacademica.Eventos;
import ccv.checkhelzio.filacademica.Ponentes;


/**
 * Created by FICG on 20/10/2016.
 */

public abstract class EventosTabla implements BaseColumns {
    public static final String TABLE_NAME="eventos";

    public static final String ID_EVENTO = "id_evento";
    public static final String ID_CARTEL = "id_cartel";
    public static final String TITULO = "titulo";
    public static final String SUBTITULO = "subtitulo";
    public static final String PONENTES = "ponentes";
    public static final String FECHAS = "fechas";
    public static final String DESCRIPCION = "descripcion";

    public ContentValues toContentValues(Eventos eventos) {
        String ponentes ="";
        for (int i = 0;i<eventos.getListaCoordinadores().size();i++){
            ponentes += eventos.getListaCoordinadores().get(i).getNombre();
        }
        ContentValues values = new ContentValues();
        values.put(EventosTabla.ID_EVENTO, eventos.getId_evento());
        values.put(EventosTabla.ID_CARTEL, eventos.getId_cartel());
        values.put(EventosTabla.TITULO, eventos.getTitulo());
        values.put(EventosTabla.SUBTITULO, eventos.getSubtitulo());
        values.put(EventosTabla.PONENTES, ponentes);

        return values;
    }

    public abstract ContentValues toContentValues();
}
