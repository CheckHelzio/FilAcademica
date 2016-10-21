package ccv.checkhelzio.filacademica.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ccv.checkhelzio.filacademica.Eventos;

/**
 * Created by FICG on 20/10/2016.
 */

public class DbFil extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "fil.db";

    public DbFil(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + EventosTabla.TABLE_NAME + " ("
            + EventosTabla._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EventosTabla.ID_EVENTO + " INTEGER,"
            + EventosTabla.ID_CARTEL + " INTEGER,"
            + EventosTabla.TITULO + " TEXT,"
            + EventosTabla.SUBTITULO + " TEXT,"
            + EventosTabla.PONENTES + " TEXT,"
            + EventosTabla.FECHAS + " TEXT,"
            + EventosTabla.DESCRIPCION + " TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void dataEvento(SQLiteDatabase sqLiteDatabase){

    }
    public long insertEvento(SQLiteDatabase db, EventosTabla eventosTabla) {
        return db.insert(
                eventosTabla.TABLE_NAME,
                null,
                eventosTabla.toContentValues());
    }
}
