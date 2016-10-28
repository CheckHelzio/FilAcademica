package ccv.checkhelzio.filacademica;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by check on 21/10/2016.
 */

public class Actividades extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private ImageView iv_info;
    private ArrayList<Eventos> listaEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreencall();
        setContentView(R.layout.actividades);
        ButterKnife.bind(this);

        iniciarPager();
        iniciarObjetos();
        setListenners();
        obtenerListaEventos();
    }

    private void obtenerListaEventos() {
        listaEventos = new ListaEventos().getEventos();
    }

    private void setListenners() {
        iv_info.setOnClickListener(this);
    }

    private void iniciarObjetos() {
        iv_info = (ImageView) findViewById(R.id.bt_info);
    }

    private void iniciarPager() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(30);
        viewPager.setAdapter(new HelzioAdapter(getSupportFragmentManager()));
    }

    public void fullScreencall() {
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

    @OnClick (R.id.bt_info)
    public void DialogInfo(){
        Intent i = new Intent (Actividades.this, InfoEventoDialog.class);
        i.putExtra("ACTIVIDAD", new ListaEventos().getEventos().get(viewPager.getCurrentItem()));
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        fullScreencall();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_info:
                Intent i = new Intent (Actividades.this, InfoEventoDialog.class);
                i.putExtra("ACTIVIDAD", listaEventos.get(viewPager.getCurrentItem()));
                Bundle bundle = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    Log.v("ERROR", "INICIAR ACTIVIY CON BUNDLE");
                    startActivity(i, bundle);
                }else {
                    startActivity(i);
                }
                break;
        }
    }
}
