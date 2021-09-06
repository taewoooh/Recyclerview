package com.example.recyclerview;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PyeungsuActivity extends AppCompatActivity {
    private final String BASE_URL = "https://taewoooh88.cafe24.com/";
    Retrofit retrofit;
    RecyclerView recyclerView;
    ArrayList<BPyeungsuViewItem> listViewItems;
    LinearLayoutManager linearLayoutManager;
    BPyeungsuAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pyeungsu_main);
        findview();
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.addItemDecoration(
                new DividerItemDecoration(this,linearLayoutManager.getOrientation()));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerViewAdapter = new BPyeungsuAdapter(this,listViewItems);
        recyclerView.setAdapter(recyclerViewAdapter);




        Tongsin("파크리오", "84.9", "11710");







    }


    public void init() {
//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();
//        // GSON 컨버터를 사용하는 REST 어댑터 생성
//        retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void findview() {
        listViewItems = new ArrayList<>();

    }


    public void Tongsin(String name, String area, String jiyeokcode) { // 서버 데이터를 가지고 온다 파라미터는 불러올 테이블 이름


        init();
        GitHub gitHub = retrofit.create(GitHub.class);
        Call<List<BPyeungsuViewItem>> call = gitHub.contributors(name, area, jiyeokcode);
        call.enqueue(new Callback<List<BPyeungsuViewItem>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            // 성공시
            public void onResponse(Call<List<BPyeungsuViewItem>> call, Response<List<BPyeungsuViewItem>> result) {
                List<BPyeungsuViewItem> contributors = result.body();
                // 받아온 리스트를 순회하면서

                Log.e("Test888", result.body().toString());

                for (BPyeungsuViewItem contributor : contributors) {


                    String name = contributor.name;
                    String price = contributor.price;
                    String area = contributor.area;
                    String year = contributor.year;
                    String month = contributor.month;
                    String day = contributor.day;
                    String high = contributor.high;
                    String doromyung = contributor.doromyung;
                    String jibun = contributor.jibun;
                    String geunmulcode = contributor.geunmulcode;
                    String jiyeokcode = contributor.jiyeokcode;
                    String bupjungdong = contributor.bupjungdong;
                    String gunchukyear = contributor.gunchukyear;
                    String today = contributor.today;


                    Log.e("dhxodn88", "" + name + " / " + price + " / " + area + " / " + year + "." + month + "." + day + " / " + high + " / " + doromyung + " / " + jibun + " / " +
                            " / " + geunmulcode + " / " + jiyeokcode + " / " + bupjungdong + " / " + gunchukyear + " / " + today);


                    month = month.replace(",", "");

                    listViewItems.add(new BPyeungsuViewItem(name, price, area, year, month, day,
                            high, doromyung, jibun, geunmulcode,
                            jiyeokcode, bupjungdong, gunchukyear, today));
                    //Collections.sort(listViewItems);
                    recyclerViewAdapter.notifyDataSetChanged();

                }


            }

            @Override
            public void onFailure(Call<List<BPyeungsuViewItem>> call, Throwable t) {
                Toast.makeText(PyeungsuActivity.this, "정보받아오기 실패 " + t, Toast.LENGTH_LONG)
                        .show();

                Log.e("onFailure", "- > " + t);

            }
        });


    }
}