package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Daydataadapter extends RecyclerView.Adapter<Daydataadapter.ViewHolder> {
    Daydatalistitem maxprice;

    private ArrayList<Daydatalistitem> listviewitem;

    public Daydataadapter(MainActivity pyeungsuActivity, ArrayList<Daydatalistitem> listviewitem) {
        this.listviewitem = listviewitem;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daydatalist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int safePosition = holder.getAdapterPosition();
        Daydatalistitem item = listviewitem.get(safePosition);

        holder.jiyeokname.setText(item.getJiyeoname());
        holder.total.setText(String.valueOf(item.getTotal()));
        holder.singoga.setText(String.valueOf(item.getSingoga()));
        holder.singogayul.setText(String.valueOf(item.getSingogayul()));


        if (item.getSingogayul() >= 60){

            holder.fire.setVisibility(View.VISIBLE);
        }else {

            holder.fire.setVisibility(View.GONE);
        }

    }


    @Override
    public int getItemCount() {
        return listviewitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView jiyeokname,total,singoga,singogayul;
        ImageView fire;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            jiyeokname = itemView.findViewById(R.id.jiyeoname);
            total = itemView.findViewById(R.id.total);
            singoga = itemView.findViewById(R.id.singoga);
            singogayul = itemView.findViewById(R.id.singogayul);
            fire = itemView.findViewById(R.id.fire);





        }
    }


}