package ccv.checkhelzio.filacademica;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.OnClick;

/**
 * Created by check on 21/10/2016.
 */

public class Actividades extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreencall();
        setContentView(R.layout.actividades);

        iniciarPager();
    }

    private void iniciarPager() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(1);
        viewPager.setPageMargin((int) getResources().getDimension(R.dimen.fab_size));
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

    }

}
