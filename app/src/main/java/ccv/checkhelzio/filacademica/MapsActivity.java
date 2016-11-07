package ccv.checkhelzio.filacademica;

import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, ViewPager.OnPageChangeListener, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ListasSedes lista = new ListasSedes();
    public static ArrayList<Sedes> listaSedes;
    public static ArrayList<Marker> listaMarcadores;
    @BindView(R.id.pagerSedes) ViewPager pagerSedes;
    @BindView(R.id.indicador_sedes) InkPageIndicator indicadorSedes;
    private SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreencall();
        setContentView(R.layout.activity_maps);
        ButterKnife.bind(this);
        listaSedes = lista.getListaSedes();
        listaMarcadores = new ArrayList<>();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        iniciarPager();
    }

    private void iniciarPager() {
        pagerSedes.setPageMargin((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics()));
        pagerSedes.setAdapter(new SedesAdapter(getSupportFragmentManager()));
        indicadorSedes.setViewPager(pagerSedes);
        pagerSedes.addOnPageChangeListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setPadding(DP(10), 0, DP(8f), DP(136));
        mMap.setOnMarkerClickListener(this);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Expo Guadalajara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        View toolbar = ((View) mapFragment.getView().findViewById(Integer.parseInt("1")).
                getParent()).findViewById(Integer.parseInt("4"));

        // and next place it, for example, on bottom right (as Google Maps app)
        RelativeLayout.LayoutParams rlp = (RelativeLayout.LayoutParams) toolbar.getLayoutParams();
        // position on right bottom
        rlp.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0);
        rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        rlp.setMargins(0, 0, 16, DP(4));

        for (Sedes sede : listaSedes){
            LatLng sede_location = new LatLng(sede.getLongitud(),sede.getLatitud());
            //mMap.addMarker(new MarkerOptions().position(sede_location).title(sede.getNombre()).snippet(sede.getDireccion()));
            listaMarcadores.add(mMap.addMarker(new MarkerOptions().position(sede_location).title(sede.getNombre()).snippet(sede.getDireccion())));
        }

        LatLng sede_location = new LatLng(listaSedes.get(0).getLongitud(), listaSedes.get(0).getLatitud());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sede_location,15));
    }

    private int DP(float v) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v, getResources().getDisplayMetrics());
    }

    private int DP(int i) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, getResources().getDisplayMetrics());
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

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(listaMarcadores.get(position).getPosition(), 15));
        listaMarcadores.get(position).showInfoWindow();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        int x = 0;
        for (Marker m : listaMarcadores){
            if (marker.equals(m)){
                pagerSedes.setCurrentItem(x, true);
            }
            x++;
        }
        return false;
    }
}
