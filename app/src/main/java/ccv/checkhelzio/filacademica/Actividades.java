package ccv.checkhelzio.filacademica;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Actividades extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    @BindView(R.id.indicador)
    TextView indicador;
    @BindView(R.id.bt_fechas)
    ImageView bt_fechas;
    @BindView(R.id.bt_coordinadores)
    ImageView bt_coordinadores;
    @BindView(R.id.bt_info)
    ImageView bt_info;
    @BindView(R.id.bt_ponentes)
    ImageView bt_ponentes;
    @BindView(R.id.bt_menu)
    ImageView bt_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreencall();
        setContentView(R.layout.actividades);
        ButterKnife.bind(this);
        iniciarPager();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setListenners();
    }

    private void setListenners() {
        bt_info.setOnClickListener(this);
        bt_fechas.setOnClickListener(this);
        bt_coordinadores.setOnClickListener(this);
        bt_ponentes.setOnClickListener(this);
        bt_menu.setOnClickListener(this);
    }

    private void iniciarPager() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(new HelzioAdapter(getSupportFragmentManager()));
        indicador.setText("1/" + viewPager.getAdapter().getCount());
        viewPager.addOnPageChangeListener(this);
    }

    public void fullScreencall() {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {
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

        switch (view.getId()) {
            case R.id.bt_info:
                i = new Intent(Actividades.this, InfoEventoDialog.class);
                i.putExtra("ACTIVIDAD", viewPager.getCurrentItem());
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                } else {
                    startActivity(i);
                }
                break;
            case R.id.bt_fechas:
                i = new Intent(Actividades.this, InfoFechasDialog.class);
                i.putExtra("ACTIVIDAD", viewPager.getCurrentItem());
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                } else {
                    startActivity(i);
                }
                break;
            case R.id.bt_coordinadores:
                i = new Intent(Actividades.this, InfoCoordinadoresDialog.class);
                i.putExtra("ACTIVIDAD", viewPager.getCurrentItem());
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                } else {
                    startActivity(i);
                }
                break;
            case R.id.bt_ponentes:
                i = new Intent(Actividades.this, InfoPonentesDialog.class);
                i.putExtra("ACTIVIDAD", viewPager.getCurrentItem());
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                    startActivity(i, bundle);
                } else {
                    startActivity(i);
                }
                break;
            case R.id.bt_menu:
                finish();
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        indicador.setText((position + 1) + "/" + viewPager.getAdapter().getCount());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
