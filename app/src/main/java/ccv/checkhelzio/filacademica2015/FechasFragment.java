package ccv.checkhelzio.filacademica2015;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FechasFragment extends Fragment {
    int fragVal;
    static FechasFragment init(int val) {
        FechasFragment truitonFrag = new FechasFragment();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        truitonFrag.setArguments(args);
        return truitonFrag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fechas_item, container, false);
        TextView tv_lugar = (TextView) layout.findViewById(R.id.tv_lugar);
        TextView tv_fecha = (TextView) layout.findViewById(R.id.tv_fecha);
        TextView tv_hora = (TextView) layout.findViewById(R.id.tv_hora);
        LinearLayout contenedor_ponenetes = (LinearLayout) layout.findViewById(R.id.contenedor_ponentes_mini);

        SimpleDateFormat format = new SimpleDateFormat("d 'de' MMMM");
        SimpleDateFormat hora = new SimpleDateFormat("h:mm a");

        String st_hora = hora.format(InfoFechasDialog.evento.getListaFecha().get(fragVal).getcal_fecha_ini().getTime()) + " - " + hora.format(InfoFechasDialog.evento.getListaFecha().get(fragVal).getcal_fecha_fin().getTime());

        tv_lugar.setText(InfoFechasDialog.evento.getListaFecha().get(fragVal).getSede().getNombre());
        tv_fecha.setText(format.format(InfoFechasDialog.evento.getListaFecha().get(fragVal).getcal_fecha_ini().getTime()));
        tv_hora.setText(st_hora);

        ArrayList<Ponentes> listaPonentes = new ListaPonentes().getPonenteEspecifico(Letra(fragVal));

        Collections.sort(listaPonentes, new Comparator<Ponentes>() {

            @Override
            public int compare(Ponentes p1,Ponentes p2) {
                String n1 = p1.getNombre() + " " + p1.getApellidos();
                String n2 = p2.getNombre() + " " + p2.getApellidos();
                return n1.compareToIgnoreCase(n2);
            }
        });

        for (Ponentes p: listaPonentes){
            View item = inflater.inflate(R.layout.ponente_item_mini, contenedor_ponenetes, false);
            CircularImageView imagen = (CircularImageView) item.findViewById(R.id.imagen_ponente);

            String st_id = "ponente" + (p.getId_ponente());
            try {
                Picasso.with(getActivity().getApplicationContext()).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica2015")).into(imagen);
            }catch (Exception ignored){
                Picasso.with(getActivity().getApplicationContext()).load(R.drawable.ponentes_generico).into(imagen);
            }

            Log.v("NUMERO", "NUMERO: " + p.getId_ponente());
            TextView nombre = (TextView) item.findViewById(R.id.nombre_ponente);
            try {
                nombre.setText(p.getNombre().split(" ")[0] + " " + p.getApellidos().substring(0, 1) + ".");
            }catch (Exception ignored){
                nombre.setText(p.getNombre().split(" ")[0] + ".");
            }
            contenedor_ponenetes.addView(item);
        }

        return layout;
    }

    private String Letra(int fragVal) {
        String l = "";

        switch (fragVal){
            case 0:
                l = "" + InfoFechasDialog.evento.getId_evento() + "A";
                break;
            case 1:
                l = "" + InfoFechasDialog.evento.getId_evento() + "B";
                break;
            case 2:
                l = "" + InfoFechasDialog.evento.getId_evento() + "C";
                break;
            case 3:
                l = "" + InfoFechasDialog.evento.getId_evento() + "D";
                break;
            case 4:
                l = "" + InfoFechasDialog.evento.getId_evento() + "E";
                break;
            case 5:
                l = "" + InfoFechasDialog.evento.getId_evento() + "F";
                break;
            case 6:
                l = "" + InfoFechasDialog.evento.getId_evento() + "G";
                break;
            case 7:
                l = "" + InfoFechasDialog.evento.getId_evento() + "H";
                break;
            case 8:
                l = "" + InfoFechasDialog.evento.getId_evento() + "I";
                break;
            case 9:
                l = "" + InfoFechasDialog.evento.getId_evento() + "J";
                break;
            case 10:
                l = "" + InfoFechasDialog.evento.getId_evento() + "K";
                break;
            case 11:
                l = "" + InfoFechasDialog.evento.getId_evento() + "L";
                break;
            case 12:
                l = "" + InfoFechasDialog.evento.getId_evento() + "M";
                break;
            case 13:
                l = "" + InfoFechasDialog.evento.getId_evento() + "N";
                break;
            case 14:
                l = "" + InfoFechasDialog.evento.getId_evento() + "O";
                break;
            case 15:
                l = "" + InfoFechasDialog.evento.getId_evento() + "P";
                break;
            case 16:
                l = "" + InfoFechasDialog.evento.getId_evento() + "Q";
                break;
            case 17:
                l = "" + InfoFechasDialog.evento.getId_evento() + "R";
                break;
            case 18:
                l = "" + InfoFechasDialog.evento.getId_evento() + "S";
                break;
            case 19:
                l = "" + InfoFechasDialog.evento.getId_evento() + "T";
                break;
            case 20:
                l = "" + InfoFechasDialog.evento.getId_evento() + "U";
                break;
            case 21:
                l = "" + InfoFechasDialog.evento.getId_evento() + "V";
                break;
            case 22:
                l = "" + InfoFechasDialog.evento.getId_evento() + "W";
                break;
            case 23:
                l = "" + InfoFechasDialog.evento.getId_evento() + "X";
                break;
            case 24:
                l = "" + InfoFechasDialog.evento.getId_evento() + "Y";
                break;
            case 25:
                l = "" + InfoFechasDialog.evento.getId_evento() + "Z";
                break;
        }

        return  l;
    }

}