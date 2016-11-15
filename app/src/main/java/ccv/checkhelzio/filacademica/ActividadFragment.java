package ccv.checkhelzio.filacademica;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ActividadFragment extends Fragment {
    int fragVal;
    static ActividadFragment init(int val) {
        ActividadFragment truitonFrag = new ActividadFragment();
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

        final ArrayList<Eventos> listaEventos = new ListaEventos().getEventos();
        View layout = inflater.inflate(R.layout.carteles, container,
                false);
        ImageView iv = (ImageView) layout.findViewById(R.id.iv_cartel);
        final TextView ti = (TextView) layout.findViewById(R.id.titulo);
        String st_id = "cartel" + (listaEventos.get(fragVal).getId_evento());
        try {
            Picasso.with(getActivity().getApplicationContext()).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(iv);
            ti.setText("");
        }catch (Exception ignored){
            Picasso.with(getActivity().getApplicationContext()).load(R.drawable.carte_generico6).into(iv, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {
                    Typeface face = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fil.ttf");
                    ti.setTypeface(face);
                    ti.setText(listaEventos.get(fragVal).getTitulo());
                }

                @Override
                public void onError() {

                }
            });
        }
        return layout;
    }
}