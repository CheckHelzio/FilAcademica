package ccv.checkhelzio.filacademica;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ccv.checkhelzio.nuevaagendacucsh.util.AnimUtils;

public class InfoEventoDialog extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_info);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        ButterKnife.bind(this);

        Slide slide = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            slide = new Slide(Gravity.BOTTOM);
            slide.setInterpolator(AnimUtils.getLinearOutSlowInInterpolator(DateDialogHelzio.this));
            slide.excludeTarget(android.R.id.statusBarBackground, true);
            slide.excludeTarget(android.R.id.navigationBarBackground, true);
            getWindow().setEnterTransition(slide);
            startPostponedEnterTransition();
        }


        //FabTransition.setup(this, conte);
        //getWindow().getSharedElementEnterTransition();
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        cerrar(null);
    }


    @OnClick (R.id.bt_dialog_aceptar)
    public void irDia(View view) {

        int mes;
        if (datePicker.getYear() == 2016) {
            mes = datePicker.getMonth();
        } else {
            mes = datePicker.getMonth();
            for (int x = 2016; x < datePicker.getYear(); x++) {
                mes += 12;
            }
        }

        Intent i = getIntent();
        i.putExtra("NUMERO_DE_MES", mes);
        setResult(RESULT_OK, i);
        cerrar(null);
    }

    @OnClick (R.id.bt_dialog_cancenlar)
    public void cerrar(View view) {
        finishAfterTransition();
    }
}
