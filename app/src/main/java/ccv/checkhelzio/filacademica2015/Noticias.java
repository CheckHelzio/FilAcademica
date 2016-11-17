package ccv.checkhelzio.filacademica2015;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by check on 17/11/2016.
 */

public class Noticias extends AppCompatActivity{

    private static boolean wifiConnected = false;
    private static boolean mobileConnected = false;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkNetworkConnection();
    }

    private void checkNetworkConnection() {
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
        if (activeInfo != null && activeInfo.isConnected()) {
            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            if (wifiConnected) {
                new DescargarNoticias().execute("http://www.fil.cucsh.udg.mx/es/noticias", Noticias.this);
            } else if (mobileConnected) {
                //DATOS MOBILES
            }
        }else {
            // NO HAY CONEXCION A INTERNET MANDAR UN AVISO AL USUARIO Y COMPROBAR CADA SEGUNDO PARA NO SATURAR EL HILO PRINCIPAL
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // A PESAR DE NO TENER INTENET SEGUIMOS INTENTANDO PARA CUANDO SE RECUPERE LA CONEXION
                    checkNetworkConnection();
                }
            },1000);
        }
    }

    public class DescargarNoticias extends AsyncTask<Object, Void, String> {

        @Override
        protected String doInBackground(Object... objects) {
            try {
                return loadFromNetwork(objects[0].toString());
            } catch (IOException e) {
                return "Error";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            postDescargar(s);
        }

        private String loadFromNetwork(String urlString) throws IOException {
            InputStream stream = null;
            String str ="";
            try {
                stream = downloadUrl(urlString);
                str = readIt(stream);
            } finally {
                if (stream != null) {
                    stream.close();
                }
            }
            return str;
        }

        private InputStream downloadUrl(String urlString) throws IOException {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(0);
            conn.setConnectTimeout(0);
            return conn.getInputStream();
        }

        private String readIt(InputStream stream) throws IOException {
            String a = "";
            String linea;
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            while ((linea = br.readLine()) != null) {
                a += linea;
            }
            return a;
        }
    }

    public void postDescargar(String s) {
        if (s.equals("Error")){

        }
    }
}
