package com.example.recyclerview;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class BPyeungsuViewItem  {


    @SerializedName("ymd")
    @Expose
    String ymd;
    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("price")
    @Expose
    String price;
    @SerializedName("area")
    @Expose
    String area;
    @SerializedName("year")
    @Expose
    String year;
    @SerializedName("month")
    @Expose
    String month;
    @SerializedName("day")
    @Expose
    String day;
    @SerializedName("high")
    @Expose
    String high;
    @SerializedName("doromyung")
    @Expose
    String doromyung;
    @SerializedName("jibun")
    @Expose
    String jibun;
    @SerializedName("geunmulcode")
    @Expose
    String geunmulcode;
    @SerializedName("jiyeokcode")
    @Expose
    String jiyeokcode;
    @SerializedName("bupjungdong")
    @Expose
    String bupjungdong;
    @SerializedName("Gunchukyear")
    @Expose
    String gunchukyear;


    @SerializedName("today")
    @Expose
    String today;


    @SerializedName("hightprice")
    @Expose
    String hightprice;
    @SerializedName("hightyear")
    @Expose
    String hightyear;
    @SerializedName("hightmonth")
    @Expose
    String hightmonth;
    @SerializedName("hightday")
    @Expose
    String hightday;


    @SerializedName("areac")
    @Expose
    String areac;


    @SerializedName("chaik")
    @Expose
    String chaik;

///////////////////////////////////////

    @SerializedName("pyungmyuendo")
    @Expose
    String pyungmyuendo;


    @SerializedName("chongdongsu")
    @Expose
    String chongdongsu;


    @SerializedName("chongsedaesu")
    @Expose
    String chongsedaesu;

    @SerializedName("juchadaesu")
    @Expose
    String juchadaesu;

    @SerializedName("pyungeunjucha")
    @Expose
    String pyungeunjucha;

    @SerializedName("yongjeukryul")
    @Expose
    String yongjeukryul;

    @SerializedName("gunpaeyul")
    @Expose
    String gunpaeyul;

    @SerializedName("ganrisamuso")
    @Expose
    String ganrisamuso;

    @SerializedName("nanbang")
    @Expose
    String nanbang;

    @SerializedName("gunseoulsa")
    @Expose
    String gunseoulsa;

    @SerializedName("jihachul")
    @Expose
    String jihachul;

    @SerializedName("mart")
    @Expose
    String mart;

    @SerializedName("hospital")
    @Expose
    String hospital;

    @SerializedName("park")
    @Expose
    String park;

    @SerializedName("cho")
    @Expose
    String cho;

    @SerializedName("jung")
    @Expose
    String jung;

    @SerializedName("go")
    @Expose
    String go;

    @SerializedName("arin")
    @Expose
    String arin;

    @SerializedName("you")
    @Expose
    String you;


    public BPyeungsuViewItem(String name, String price,
                             String area, String year,
                             String month, String day,
                             String high, String doromyung,
                             String jibun, String geunmulcode,
                             String jiyeokcode,
                             String bupjungdong,
                             String gunchukyear,
                             String today) {
        this.name = name;
        this.price = price;
        this.area = area;
        this.year = year;
        this.month = month;
        this.day = day;
        this.high = high;
        this.doromyung = doromyung;
        this.jibun = jibun;
        this.geunmulcode = geunmulcode;
        this.jiyeokcode = jiyeokcode;
        this.bupjungdong = bupjungdong;
        this.gunchukyear = gunchukyear;
        this.today = today;

    }

    public BPyeungsuViewItem(String year, String price) {

        this.year = year;

        this.price = price;
    }


    public String getPyungmyuendo() {
        return pyungmyuendo;
    }

    public String getChongdongsu() {
        return chongdongsu;
    }

    public String getChongsedaesu() {
        return chongsedaesu;
    }

    public String getJuchadaesu() {
        return juchadaesu;
    }

    public String getPyungeunjucha() {
        return pyungeunjucha;
    }

    public String getYongjeukryul() {
        return yongjeukryul;
    }

    public String getGunpaeyul() {
        return gunpaeyul;
    }

    public String getGanrisamuso() {
        return ganrisamuso;
    }

    public String getNanbang() {
        return nanbang;
    }

    public String getGunseoulsa() {
        return gunseoulsa;
    }

    public String getJihachul() {
        return jihachul;
    }

    public String getMart() {
        return mart;
    }

    public String getHospital() {
        return hospital;
    }

    public String getPark() {
        return park;
    }

    public String getCho() {
        return cho;
    }

    public String getJung() {
        return jung;
    }

    public String getGo() {
        return go;
    }

    public String getArin() {
        return arin;
    }

    public String getYou() {
        return you;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public void setPyungmyuendo(String pyungmyuendo) {
        this.pyungmyuendo = pyungmyuendo;
    }

    public void setChongdongsu(String chongdongsu) {
        this.chongdongsu = chongdongsu;
    }

    public void setChongsedaesu(String chongsedaesu) {
        this.chongsedaesu = chongsedaesu;
    }

    public void setJuchadaesu(String juchadaesu) {
        this.juchadaesu = juchadaesu;
    }

    public void setPyungeunjucha(String pyungeunjucha) {
        this.pyungeunjucha = pyungeunjucha;
    }

    public void setYongjeukryul(String yongjeukryul) {
        this.yongjeukryul = yongjeukryul;
    }

    public void setGunpaeyul(String gunpaeyul) {
        this.gunpaeyul = gunpaeyul;
    }

    public void setGanrisamuso(String ganrisamuso) {
        this.ganrisamuso = ganrisamuso;
    }

    public void setNanbang(String nanbang) {
        this.nanbang = nanbang;
    }

    public void setGunseoulsa(String gunseoulsa) {
        this.gunseoulsa = gunseoulsa;
    }

    public void setJihachul(String jihachul) {
        this.jihachul = jihachul;
    }

    public void setMart(String mart) {
        this.mart = mart;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public void setCho(String cho) {
        this.cho = cho;
    }

    public void setJung(String jung) {
        this.jung = jung;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public void setArin(String arin) {
        this.arin = arin;
    }

    public void setYou(String you) {
        this.you = you;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    public String getYmd() {
        return ymd;
    }

    public void setAreac(String areac) {
        this.areac = areac;
    }

    public String getAreac() {
        return areac;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public String getChaik() {
        return chaik;
    }

    public void setChaik(String chaik) {
        this.chaik = chaik;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getDoromyung() {
        return doromyung;
    }

    public void setDoromyung(String doromyung) {
        this.doromyung = doromyung;
    }

    public String getJibun() {
        return jibun;
    }

    public void setJibun(String jibun) {
        this.jibun = jibun;
    }

    public String getGeunmulcode() {
        return geunmulcode;
    }

    public void setGeunmulcode(String geunmulcode) {
        this.geunmulcode = geunmulcode;
    }

    public String getJiyeokcode() {
        return jiyeokcode;
    }

    public void setJiyeokcode(String jiyeokcode) {
        this.jiyeokcode = jiyeokcode;
    }

    public String getBupjungdong() {
        return bupjungdong;
    }

    public void setBupjungdong(String bupjungdong) {
        this.bupjungdong = bupjungdong;
    }

    public String getGunchukyear() {
        return gunchukyear;
    }

    public void setGunchukyear(String gunchukyear) {
        this.gunchukyear = gunchukyear;
    }


    public void setHightprice(String hightprice) {
        this.hightprice = hightprice;
    }

    public void setHightyear(String hightyear) {
        this.hightyear = hightyear;
    }

    public void setHightmonth(String hightmonth) {
        this.hightmonth = hightmonth;
    }

    public void setHightday(String hightday) {
        this.hightday = hightday;
    }

    public String getHightprice() {
        return hightprice;
    }

    public String getHightyear() {
        return hightyear;
    }

    public String getHightmonth() {
        return hightmonth;
    }

    public String getHightday() {
        return hightday;
    }

    public String getToday() {
        return today;
    }


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
