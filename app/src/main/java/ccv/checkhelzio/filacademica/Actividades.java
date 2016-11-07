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
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by check on 21/10/2016.
 */

public class Actividades extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private ImageView iv_info;
    private ArrayList<Eventos> listaEventos;
    @BindView(R.id.indicador) TextView indicador;
    @BindView(R.id.bt_fechas) ImageView bt_fechas;

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
        bt_fechas.setOnClickListener(this);
    }

    private void iniciarObjetos() {
        iv_info = (ImageView) findViewById(R.id.bt_info);
    }

    private void iniciarPager() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(new ListaEventos().getEventos().size());
        viewPager.setAdapter(new HelzioAdapter(getSupportFragmentManager()));
        indicador.setText("1/" + viewPager.getAdapter().getCount());
        viewPager.addOnPageChangeListener(this);
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


    @Override
    protected void onResume() {
        super.onResume();
        fullScreencall();
    }

    @Override
    public void onClick(View view) {
        Intent i;
        Bundle bundle = null;

        switch (view.getId()){
            case R.id.bt_info:
                i = new Intent (Actividades.this, InfoEventoDialog.class);
                i.putExtra("ACTIVIDAD", listaEventos.get(viewPager.getCurrentItem()));
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                }else {
                    startActivity(i);
                }
                break;
            case R.id.bt_fechas:
                i = new Intent (Actividades.this, InfoFechasDialog.class);
                i.putExtra("ACTIVIDAD", listaEventos.get(viewPager.getCurrentItem()));
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                }else {
                    startActivity(i);
                }
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        indicador.setText((position + 1 ) + "/" + viewPager.getAdapter().getCount());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
