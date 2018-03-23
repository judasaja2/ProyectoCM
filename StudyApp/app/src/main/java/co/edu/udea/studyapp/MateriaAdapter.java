package co.edu.udea.studyapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Xjuan on 23/03/2018.
 */

public class MateriaAdapter extends RecyclerView.Adapter<MateriaAdapter.MateriaViewHolder> {

    private Context mContext;
    private List<Materia> materiaList;


    public MateriaAdapter(Context mContext, List<Materia> materiaList) {
        this.mContext = mContext;
        this.materiaList = materiaList;
    }

    @Override
    public MateriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout_materia, parent, false);
        return new MateriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MateriaViewHolder holder, int position) {
        Materia materia = materiaList.get(position);

        holder.textViewMateria.setText(materia.getNombreMateria());
        holder.textViewFechaPublicacion.setText("Último apunte publicado:" + materia.getFechaPublicacion());

        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(materia.getImage()));
    }

    @Override
    public int getItemCount() {
        return materiaList.size();
    }

    class MateriaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewMateria, textViewFechaPublicacion;
        public MateriaViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewMateria = itemView.findViewById(R.id.textViewMateria);
            textViewFechaPublicacion = itemView.findViewById(R.id.textViewFechaPublicacion);
        }
    }

}
