package com.example.recyclerview;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class BPyeungsuViewItem  {


    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public BPyeungsuViewItem(String ym, String price, String count) {
        this.ym = ym;
        this.price = price;
        this.count = count;
    }

    @SerializedName("ym")
    @Expose
    String ym;
    @SerializedName("price")
    @Expose
    String price;

    @SerializedName("count")
    @Expose
    String count;









    //내림차순
//    @Override
//    public int compareTo(ListViewItem entry) {
//
//
//
//
//
//
//        return entry.getPrice().compareTo(this.getPrice());
//
//
//    }
//
//






}
