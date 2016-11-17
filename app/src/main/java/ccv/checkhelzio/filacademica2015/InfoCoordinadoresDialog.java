package ccv.checkhelzio.filacademica2015;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoCoordinadoresDialog extends AppCompatActivity {

    @BindView(R.id.tv_titulo_evento) TextView tv_titulo_evento;
    @BindView(R.id.recycle) RecyclerView rvEventos;
    protected static Eventos evento;
    private ArrayList<Ponentes> listaCoordinadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.dialog_info_coordinadores);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        ButterKnife.bind(this);

        rvEventos.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rvEventos.setLayoutManager(mLayoutManager);

        evento = new ListaEventos().getEventoEspecifico((getIntent().getIntExtra("ACTIVIDAD", 0)));
        listaCoordinadores = new ListaOrganizadores().getCoordinadorEspecifico(evento.getId_evento());

        Collections.sort(listaCoordinadores, new Comparator<Ponentes>() {

            @Override
            public int compare(Ponentes p1,Ponentes p2) {
                String n1 = p1.getNombre() + " " + p1.getApellidos();
                String n2 = p2.getNombre() + " " + p2.getApellidos();
                return n1.compareToIgnoreCase(n2);
            }
        });

        setDatos();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.setInterpolator(AnimUtils.getLinearOutSlowInInterpolator(InfoCoordinadoresDialog.this));
            slide.excludeTarget(android.R.id.statusBarBackground, true);
            slide.excludeTarget(android.R.id.navigationBarBackground, true);
            getWindow().setEnterTransition(slide);
            startPostponedEnterTransition();
        }
    }

    private void setDatos() {
        tv_titulo_evento.setText(evento.getTitulo());
        iniciarAdaptador();
    }

    private void iniciarAdaptador() {
        PonentesAdaptador adaptador = new PonentesAdaptador(listaCoordinadores, InfoCoordinadoresDialog.this);
        rvEventos.setAdapter(adaptador);
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
