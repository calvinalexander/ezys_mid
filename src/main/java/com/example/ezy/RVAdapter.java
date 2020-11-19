package com.example.ezy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ImageViewHolder> {
    private int[] imageList;
    private String[] nameList;
    private int[] priceList;


    public RVAdapter(int[] imageList, String[] nameList, int[] priceList){
        this.imageList = imageList;
        this.nameList = nameList;
        this.priceList = priceList;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design, parent, false);
        ImageViewHolder imgVh = new ImageViewHolder(v);
        return imgVh;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int img_id = imageList[position];
        final String name_id = nameList[position];
        int price_id = priceList[position];
        holder.imgList.setImageResource(img_id);
        holder.nameList.setText(name_id);
        holder.priceList.setText("Rp."+price_id);
        holder.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity3.class);
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageList.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imgList;
        TextView nameList;
        TextView priceList;
        LinearLayout next;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imgList = itemView.findViewById(R.id.drinkProduct);
            nameList = itemView.findViewById(R.id.drinkName);
            priceList = itemView.findViewById(R.id.drinkPrice);
            next = itemView.findViewById(R.id.nextPage);
        }
    }
}
