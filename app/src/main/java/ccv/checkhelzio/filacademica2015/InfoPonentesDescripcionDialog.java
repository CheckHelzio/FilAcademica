package ccv.checkhelzio.filacademica2015;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoPonentesDescripcionDialog extends Activity {

    @BindView(R.id.nombre) TextView nombre;
    @BindView(R.id.descripcion) TextView descipcion;
    @BindView(R.id.imagen)
    CircularImageView imagen;
    @BindView(R.id.tv_descripcion)
    TextViewEx tv_descripcion;
    Ponentes ponentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.dialog_info_ponentes_descripcion);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        ButterKnife.bind(this);

        ponentes = getIntent().getParcelableExtra("ACTIVIDAD");
        setDatos();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.setInterpolator(AnimUtils.getLinearOutSlowInInterpolator(InfoPonentesDescripcionDialog.this));
            slide.excludeTarget(android.R.id.statusBarBackground, true);
            slide.excludeTarget(android.R.id.navigationBarBackground, true);
            getWindow().setEnterTransition(slide);
            startPostponedEnterTransition();
        }
    }

    private void setDatos() {
        try {
            nombre.setText(ponentes.getNombre() + " " + ponentes.getApellidos());
        }catch (Exception ignored){
            nombre.setText(ponentes.getNombre());
        }

        try {
            if (ponentes.getDato().isEmpty()){
                descipcion.setText("Ponente");
            }else {
                descipcion.setText(ponentes.getDato());
            }
        }catch (Exception ignored){
            descipcion.setText("Ponente");
        }

        String st_id = "ponente" + (ponentes.getId_ponente());
        try {
            Picasso.with(this).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(imagen);
        }catch (Exception ignored){
            Picasso.with(this).load(R.drawable.ponentes_generico).into(imagen);
        }
        tv_descripcion.setText(ponentes.getDescripcion(), true);

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

    public void cerrar(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    private int DP(int i) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, getResources().getDisplayMetrics());
    }
}
