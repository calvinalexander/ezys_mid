package com.example.ezy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LastAdapter extends RecyclerView.Adapter<LastAdapter.ViewHolder> {
    private String[] nams;
    private int[] hargs;

    public LastAdapter(String[] nams, int[] hargs){
        this.nams = nams;
        this.hargs = hargs;
    }

    @NonNull
    @Override
    public LastAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.last_design,parent,false);
        ViewHolder tView = new ViewHolder(view);
        return tView;
    }

    @Override
    public void onBindViewHolder(@NonNull LastAdapter.ViewHolder holder, int position) {
        String nams_id = nams[position];
        int hargs_id = hargs[position];

        holder.nams.setText(nams_id);
        holder.hargs.setText("Rp."+hargs_id*50);
    }

    @Override
    public int getItemCount() {
        return nams.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nams;
        TextView hargs;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nams = itemView.findViewById(R.id.nama);
            hargs = itemView.findViewById(R.id.harga);
        }
    }
}
