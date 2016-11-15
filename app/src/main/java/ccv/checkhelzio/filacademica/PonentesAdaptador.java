package ccv.checkhelzio.filacademica;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PonentesAdaptador extends RecyclerView.Adapter<PonentesAdaptador.PonentesViewHolder> {

    private List<Ponentes> ponentesList;
    private Context mContext;

    public PonentesAdaptador(List<Ponentes> ponentes, Context context) {
        this.ponentesList = ponentes;
        mContext = context;
    }

    @Override
    public PonentesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ponente_item_full, parent, false);
        return new PonentesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PonentesViewHolder ponentesViewHolder , int position) {
        final Ponentes ponente = ponentesList.get(position);
        ponentesViewHolder.nombre.setText(ponente.getNombre() + " " + ponente.getApellidos());
        try {
            if (ponente.getDato().isEmpty()){
                ponentesViewHolder.descripcion.setText("Ponente");
            }else {
                ponentesViewHolder.descripcion.setText(ponente.getDato());
            }
        }catch (Exception ignored){
            ponentesViewHolder.descripcion.setText("Ponente");
        }


        String st_id = "ponente" + (ponente.getId_ponente());
        try {
            Picasso.with(mContext).load(mContext.getResources().getIdentifier(st_id, "drawable", "ccv.checkhelzio.filacademica")).into(ponentesViewHolder.imagen);
        }catch (Exception ignored){
            Picasso.with(mContext).load(R.drawable.ponentes_generico).into(ponentesViewHolder.imagen);
        }
    }


    @Override
    public int getItemCount() {
        return ponentesList.size();
    }

    public static class PonentesViewHolder extends RecyclerView.ViewHolder{
        private TextView descripcion, nombre;
        private CircularImageView imagen;

        public PonentesViewHolder(View itemView) {
            super(itemView);
            descripcion = (TextView) itemView.findViewById(R.id.descripcion);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            imagen = (CircularImageView) itemView.findViewById(R.id.imagen);
        }
    }

}
