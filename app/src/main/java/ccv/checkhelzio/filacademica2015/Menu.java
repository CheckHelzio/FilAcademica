package ccv.checkhelzio.filacademica2015;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Menu extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.bt_actividades) RelativeLayout bt_actividades;
    @BindView(R.id.bt_sedes) RelativeLayout bt_sedes;
    @BindView(R.id.bt_spot) RelativeLayout bt_spot;
    @BindView(R.id.bt_historia) RelativeLayout bt_historia;
    @BindView(R.id.bt_ponentes) RelativeLayout bt_ponentes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.menu);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        FullScreencall();
        setListenners();
    }

    private void setListenners() {
        bt_actividades.setOnClickListener(this);
        bt_sedes.setOnClickListener(this);
        bt_spot.setOnClickListener(this);
        bt_historia.setOnClickListener(this);
        bt_ponentes.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FullScreencall();
    }

    public void FullScreencall() {
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

    @Override
    public void onClick(final View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i;
                switch (view.getId()){
                    case R.id.bt_actividades:
                        i = new Intent(Menu.this, Actividades.class);
                        startActivity(i);
                        break;
                    case R.id.bt_sedes:
                        i = new Intent(Menu.this, MapsActivity.class);
                        startActivity(i);
                        break;
                    case R.id.bt_spot:
                        i = new Intent(Menu.this, VideoActivity.class);
                        startActivity(i);
                        break;
                    case R.id.bt_historia:
                        i = new Intent(Menu.this, Historia.class);
                        startActivity(i);
                        break;
                    case R.id.bt_ponentes:
                        i = new Intent(Menu.this, PonentesLayout.class);
                        startActivity(i);
                        break;
                }
            }
        },300);
    }
}
