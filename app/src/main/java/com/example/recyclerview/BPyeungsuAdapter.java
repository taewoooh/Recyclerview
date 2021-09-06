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

        holder.newdata.setImageResource(0);
        holder.updown.setImageResource(0);
        holder.price2.setText("");


        if (listviewitem.size() - 1 == safePosition) {

            holder.updown_price.setText("");


        } else {
            BPyeungsuViewItem item2 = listviewitem.get(safePosition + 1);

            int a = Integer.parseInt(item.getPrice()); // 현재가격
            int b = Integer.parseInt(item2.getPrice());//바로 이전가격


            if (a > b) {

                int c = a - b;
                String v = String.valueOf(c);
                v = new Util().Priceedit(v);
                holder.updown.setImageResource(R.drawable.up);
                holder.center.setVisibility(View.INVISIBLE);

                holder.updown_price.setText(v);


            } else if (a < b) {
                int c = a - b;
                String v = String.valueOf(c);
                v = new Util().Priceedit(v);
                holder.center.setVisibility(View.INVISIBLE);
                holder.updown.setImageResource(R.drawable.down);
                holder.updown_price.setText(v);
            } else {
                int c = a - b;
                String v = String.valueOf(c);
                v = new Util().Priceedit(v);
                holder.center.setVisibility(View.VISIBLE);

                holder.updown_price.setText(v);

            }


        }
        maxprice = Collections.max(listviewitem, new Comparator<BPyeungsuViewItem>() { // price 최고가격 구하기
            @Override
            public int compare(BPyeungsuViewItem first, BPyeungsuViewItem second) {
                if (Integer.parseInt(first.getPrice()) > Integer.parseInt(second.getPrice())) {
                    return 1;
                } else if (Integer.parseInt(first.getPrice()) < Integer.parseInt(second.getPrice())) {
                    return -1;

                }
                return 0;
            }
        });


        if (Integer.parseInt(maxprice.getPrice()) == Integer.parseInt(item.getPrice())) {

            holder.price2.setText("[ 최고가 ]");

        }

        String y = item.getYear().substring(2, item.getYear().length());//2021년 에서 - > 텍스트 줄이기 21년으로 변경하기
        String ymd = y + "." + item.getMonth() + "." + item.getDay();
        String price_s = new Util().Priceedit(String.valueOf(item.getPrice()));

        if (item.getToday()!= null) {
            if (Integer.parseInt(item.getToday()) == Integer.parseInt(new Util().Getday())) { // 신규 데이터인지 확인하고 이미지 삽입하기 v

                holder.newdata.setImageResource(R.drawable.check);

            }
        }

        holder.dayday.setText(ymd);
        holder.price1.setText(price_s);
        holder.high.setText(item.getHigh());


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