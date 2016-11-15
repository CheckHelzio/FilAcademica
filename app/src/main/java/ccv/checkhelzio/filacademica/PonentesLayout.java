package ccv.checkhelzio.filacademica;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PonentesLayout extends AppCompatActivity {
    @BindView(R.id.toolbar_ponentes) Toolbar toolbar;
    @BindView(R.id.collapsing_ponentes) CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.recycle) RecyclerView rvEventos;
    private ArrayList<Ponentes> listaPonentes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.ponentes_layout);
        ButterKnife.bind(this);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBarPlus1);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBarPlus1);
        collapsingToolbarLayout.setCollapsedTitleTypeface(Typeface.DEFAULT_BOLD);
        collapsingToolbarLayout.setExpandedTitleTypeface(Typeface.DEFAULT_BOLD);
        collapsingToolbarLayout.setTitle("Ponentes de la FIL Académica");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                },300);
            }
        });

        listaPonentes = new ListaPonentes().getAllPonentes();

        rvEventos.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rvEventos.setLayoutManager(mLayoutManager);

        Collections.sort(listaPonentes, new Comparator<Ponentes>() {
            @Override
            public int compare(Ponentes p1, Ponentes p2) {
                String n1 = p1.getNombre() + " " + p1.getApellidos();
                String n2 = p2.getNombre() + " " + p2.getApellidos();
                return n1.compareToIgnoreCase(n2);
            }
        });

        setDatos();
    }

    private void setDatos() {
        iniciarAdaptador();
    }

    private void iniciarAdaptador() {
        PonentesAdaptador adaptador = new PonentesAdaptador(listaPonentes, PonentesLayout.this);
        rvEventos.setAdapter(adaptador);
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
}
