package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BPyeungsuAdapter extends RecyclerView.Adapter<BPyeungsuAdapter.ViewHolder> {
    BPyeungsuViewItem maxprice;

    private ArrayList<BPyeungsuViewItem> listviewitem;

    public BPyeungsuAdapter(PyeungsuActivity pyeungsuActivity, ArrayList<BPyeungsuViewItem> listviewitem) {
        this.listviewitem = listviewitem;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pyeungsulist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int safePosition = holder.getAdapterPosition();
       BPyeungsuViewItem item = listviewitem.get(safePosition);



    }


    @Override
    public int getItemCount() {
        return listviewitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView dayday, price1, price2, high, updown_price,p_juso;
        ImageView updown, newdata, center;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            updown_price = itemView.findViewById(R.id.updown_price);
            dayday = itemView.findViewById(R.id.dayday);
            price1 = itemView.findViewById(R.id.price1);
            price2 = itemView.findViewById(R.id.price2);
            high = itemView.findViewById(R.id.high);
            updown = itemView.findViewById(R.id.updown);
            newdata = itemView.findViewById(R.id.newdata);
            center = itemView.findViewById(R.id.center);

         //   p_juso = itemView.findViewById(R.id.p_juso); //아파트 주소



        }
    }


}