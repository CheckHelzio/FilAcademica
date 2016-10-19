package ccv.checkhelzio.filacademica;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Portada extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
    }
}
