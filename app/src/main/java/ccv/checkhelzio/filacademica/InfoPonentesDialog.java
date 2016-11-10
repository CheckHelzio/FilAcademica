package ccv.checkhelzio.filacademica;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoPonentesDialog extends AppCompatActivity {

    @BindView(R.id.tv_titulo_evento) TextView tv_titulo_evento;
    @BindView(R.id.conte_ponentes)
    LinearLayout conte_ponentes;
    protected static Eventos evento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.dialog_info_ponentes);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        ButterKnife.bind(this);

        evento = getIntent().getParcelableExtra("ACTIVIDAD");
        setDatos();

        ArrayList<Ponentes> listaCoordinadores = new ListaPonentes().getPonenteEspecifico2(evento.getId_evento());

        Collections.sort(listaCoordinadores, new Comparator<Ponentes>() {

            @Override
            public int compare(Ponentes p1,Ponentes p2) {
                String n1 = p1.getNombre() + " " + p1.getApellidos();
                String n2 = p2.getNombre() + " " + p2.getApellidos();
                return n1.compareToIgnoreCase(n2);
            }
        });

        for (Ponentes p: listaCoordinadores){
            View item = LayoutInflater.from(InfoPonentesDialog.this).inflate(R.layout.ponente_item_full, conte_ponentes, false);
            CircularImageView imagen = (CircularImageView) item.findViewById(R.id.imagen);

            String st_id = "ponente" + (p.getId_ponente());
            try {
                Picasso.with(getApplicationContext()).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(imagen);
            }catch (Exception ignored){
                Picasso.with(getApplicationContext()).load(R.drawable.ponentes_generico).into(imagen);
            }

            TextView nombre = (TextView) item.findViewById(R.id.nombre);
            TextView descripcion = (TextView) item.findViewById(R.id.descripcion);
            nombre.setText(p.getNombre() + " " + p.getApellidos());
            try {
                if (p.getDato().isEmpty()){
                    descripcion.setText("Ponente");
                }else {
                    descripcion.setText(p.getDato());
                }
            }catch (Exception ignored){
                descripcion.setText("Ponente");
            }
            conte_ponentes.addView(item);
        }


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.setInterpolator(AnimUtils.getLinearOutSlowInInterpolator(InfoPonentesDialog.this));
            slide.excludeTarget(android.R.id.statusBarBackground, true);
            slide.excludeTarget(android.R.id.navigationBarBackground, true);
            getWindow().setEnterTransition(slide);
            startPostponedEnterTransition();
        }
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
