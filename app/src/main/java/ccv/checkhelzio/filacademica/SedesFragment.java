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


public class SedesFragment extends Fragment {
    int fragVal;
    static SedesFragment init(int val) {
        SedesFragment truitonFrag = new SedesFragment();
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
        View layout = inflater.inflate(R.layout.sedes, container, false);

        ImageView iv = (ImageView) layout.findViewById(R.id.iv_cartel);
        Typeface face = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fil.ttf");
        TextView nombre = (TextView) layout.findViewById(R.id.nombre_sede);
        TextView direccion = (TextView) layout.findViewById(R.id.direccion_sede);

        nombre.setTypeface(face);
        direccion.setTypeface(face);

        nombre.setText(MapsActivity.listaSedes.get(fragVal).getNombre());
        direccion.setText(MapsActivity.listaSedes.get(fragVal).getDireccion());
        String st_id = "sede" + (fragVal + 1);
        Picasso.with(getActivity().getApplicationContext()).load(getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(iv);
        return layout;
    }

}