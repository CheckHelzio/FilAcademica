package ccv.checkhelzio.filacademica;

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
        View layout = inflater.inflate(R.layout.carteles, container,
                false);
        ImageView iv = (ImageView) layout.findViewById(R.id.iv_cartel);
        TextView ti = (TextView) layout.findViewById(R.id.titulo);
        String st_id = "cartel" + (fragVal + 1);
        try {
            Picasso.with(getActivity().getApplicationContext()).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(iv);
        }catch (Exception ignored){
            Picasso.with(getActivity().getApplicationContext()).load(R.drawable.carte_generico).into(iv);

            ArrayList<Eventos> listaEventos = new ListaEventos().getEventos();
            ti.setText(listaEventos.get(fragVal).getTitulo());
        }
        return layout;
    }

}