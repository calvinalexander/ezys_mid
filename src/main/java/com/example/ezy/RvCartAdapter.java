package com.example.ezy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvCartAdapter extends RecyclerView.Adapter<RvCartAdapter.ViewHolder> {
    private String[] productDetail;
    private int[] productPrice;

    public RvCartAdapter(String[] productDetail, int[] productPrice){
        this.productDetail = productDetail;
        this.productPrice = productPrice;
    }


    @NonNull
    @Override
    public RvCartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cart_design, parent, false);
        ViewHolder txt = new ViewHolder(v);
        return txt;
    }

    @Override
    public void onBindViewHolder(@NonNull RvCartAdapter.ViewHolder holder, int position) {
        String product_id = productDetail[position];
        int price_id = productPrice[position];

        holder.productDetail.setText(product_id);
        holder.productPrice.setText("Rp."+price_id*40);
    }

    @Override
    public int getItemCount() {
        return productDetail.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView productDetail;
        TextView productPrice;
        Button deleteProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productDetail = itemView.findViewById(R.id.drinkNames);
            productPrice = itemView.findViewById(R.id.priceDetail);
            deleteProduct =itemView.findViewById(R.id.deleteItem);
        }
    }
}
