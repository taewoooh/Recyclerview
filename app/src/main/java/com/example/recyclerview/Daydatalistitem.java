package com.example.recyclerview;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class Daydatalistitem {


    public Daydatalistitem(String jiyeoname, int total, int singoga, int singogayul) {
        this.jiyeoname = jiyeoname;
        this.total = total;
        this.singoga = singoga;
        this.singogayul = singogayul;
    }

    public String getJiyeoname() {
        return jiyeoname;
    }

    public void setJiyeoname(String jiyeoname) {
        this.jiyeoname = jiyeoname;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSingoga() {
        return singoga;
    }

    public void setSingoga(int singoga) {
        this.singoga = singoga;
    }

    public int getSingogayul() {
        return singogayul;
    }

    public void setSingogayul(int singogayul) {
        this.singogayul = singogayul;
    }

    @SerializedName("jiyeoname")
    @Expose
    public
    String jiyeoname;

    @SerializedName("total")
    @Expose
    public
    int total;

    @SerializedName("singoga")
    @Expose
    public
    int singoga;

    @SerializedName("singogayul")
    @Expose
    public
    int singogayul;


}