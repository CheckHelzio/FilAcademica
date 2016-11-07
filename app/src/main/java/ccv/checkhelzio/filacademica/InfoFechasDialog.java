package ccv.checkhelzio.filacademica;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoFechasDialog extends AppCompatActivity {

    @BindView(R.id.tv_titulo_evento) TextView tv_titulo_evento;
    @BindView(R.id.pagerFechas) ViewPager pagerFechas;
    @BindView(R.id.indicador_fechas) InkPageIndicator indicadorFechas;
    protected static Eventos evento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.dialog_info_fechas);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        ButterKnife.bind(this);

        evento = getIntent().getParcelableExtra("ACTIVIDAD");
        setDatos();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.setInterpolator(AnimUtils.getLinearOutSlowInInterpolator(InfoFechasDialog.this));
            slide.excludeTarget(android.R.id.statusBarBackground, true);
            slide.excludeTarget(android.R.id.navigationBarBackground, true);
            getWindow().setEnterTransition(slide);
            startPostponedEnterTransition();
        }
        iniciarPager();
    }

    private void iniciarPager() {
        pagerFechas.setOffscreenPageLimit(evento.getListaFecha().size());
        pagerFechas.setAdapter(new FechasAdapter(getSupportFragmentManager()));
        indicadorFechas.setViewPager(pagerFechas);
    }

    private void setDatos() {
        tv_titulo_evento.setText(evento.getTitulo());
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        cerrar(null);
    }

    @Override
    protected void onResume() {
        super.onResume();
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

    public void cerrar(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAfterTransition();
        }else {
            finish();
        }
    }

}
