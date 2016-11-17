package ccv.checkhelzio.filacademica2015;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Portada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*SharedPreferences prefs = getSharedPreferences("FIL 2016", Context.MODE_PRIVATE);
        if (prefs.getInt("Video Presentacion", 0) == 0) {
            prefs.edit().putInt("Video Presentacion", -1).apply();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(Portada.this, VideoActivity.class);
                    startActivity(i);
                    finish();
                }
            },2000);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(Portada.this, Menu.class);
                    startActivity(i);
                    finish();
                }
            },2000);
        }*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Portada.this, Menu.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
}
