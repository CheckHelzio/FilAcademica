package ccv.checkhelzio.filacademica;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

public class Portada extends AppCompatActivity {

    SharedPreferences prefs;
    ImageView imagen_portada;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall2();
        setContentView(R.layout.activity_portada);

        prefs = getSharedPreferences("FIL P", Context.MODE_PRIVATE);
        videoView = (VideoView) findViewById(R.id.video_portada);
        imagen_portada = (ImageView) findViewById(R.id.iv_portada);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.fil_academica); //do not add any extension
        videoView.setVideoURI(video);
        videoView.setFocusable(false);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                prefs.edit().putInt("Video Presentacion", 1).apply();
                Intent i = new Intent(Portada.this, Menu.class);
                startActivity(i);
                finish();
            }
        });


        if (prefs.getInt("Video Presentacion", 0) == 0) {
            imagen_portada.setVisibility(View.GONE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
            FullScreencall();
            videoView.start();
        } else {
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

    public void FullScreencall() {
        View decor_View = getWindow().getDecorView();
        int ui_Options = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decor_View.setSystemUiVisibility(ui_Options);
    }

    public void FullScreencall2() {
        if(Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if(Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }
}
