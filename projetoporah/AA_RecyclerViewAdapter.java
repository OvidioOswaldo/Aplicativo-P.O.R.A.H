package com.ovidiooswaldo.projetoporah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerViewAdapter extends RecyclerView.Adapter<AA_RecyclerViewAdapter.MyViewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;

    Context context;
    ArrayList<PacienteModel> pacienteModels;

    public AA_RecyclerViewAdapter(Context context, ArrayList<PacienteModel> pacienteModels,
                                  RecyclerViewInterface recyclerViewInterface){
        this.context = context;
        this.pacienteModels = pacienteModels;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tvName.setText(pacienteModels.get(position).getNomedopaciente());
        holder.tvDiagnostico.setText(pacienteModels.get(position).getInfo());
        holder.imageView.setImageResource(pacienteModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return pacienteModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvName, tvDiagnostico;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.nomepaciente);
            tvDiagnostico = itemView.findViewById(R.id.diagnostico);
        }
    }
}
