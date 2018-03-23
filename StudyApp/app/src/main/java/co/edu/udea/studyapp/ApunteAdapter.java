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

public class ApunteAdapter extends RecyclerView.Adapter<ApunteAdapter.ApunteViewHolder> {
    private Context mContext;
    private List<Apunte> apunteList;


    public ApunteAdapter(Context mContext, List<Apunte> apunteList) {
        this.mContext = mContext;
        this.apunteList = apunteList;
    }

    @Override
    public ApunteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout_apunte, parent, false);
        return new ApunteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ApunteViewHolder holder, int position) {
        Apunte apunte = apunteList.get(position);

        holder.textViewApunte.setText(apunte.getNombreApunte());
        holder.textViewDescripcionApunte.setText(apunte.getDescripcionApunte());
        holder.textViewFechaPublicacion.setText(apunte.getFechaPublicacion());

    }

    @Override
    public int getItemCount() {
        return apunteList.size();
    }

    class ApunteViewHolder extends RecyclerView.ViewHolder {
        TextView textViewApunte, textViewDescripcionApunte, textViewFechaPublicacion;
        public ApunteViewHolder(View itemView) {
            super(itemView);
            textViewApunte = itemView.findViewById(R.id.textViewApunte);
            textViewDescripcionApunte = itemView.findViewById(R.id.textViewDescripcionApunte);
            textViewFechaPublicacion = itemView.findViewById(R.id.textViewFechaApunte);
        }
    }
}
