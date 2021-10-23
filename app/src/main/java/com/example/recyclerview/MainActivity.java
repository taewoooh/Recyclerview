package com.example.recyclerview;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private final String BASE_URL = "https://taewoooh88.cafe24.com/";
    Retrofit retrofit;
    RecyclerView recyclerView,daydatarecyclerview;
    ArrayList<Daydatalistitem> listViewItems;
    LinearLayoutManager linearLayoutManager;
    Daydataadapter recyclerViewAdapter;
    AlertDialog dialo;
    AlertDialog.Builder dia;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();






      //  Tongsin("20211023");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Daydata();

            }
        });






    }


    public void init() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        // GSON 컨버터를 사용하는 REST 어댑터 생성
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


    }

    public void findview() {
        listViewItems = new ArrayList<>();
        btn =(Button)findViewById(R.id.btn);

    }
    public void Daydata() { //
        View inflate1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.daydatajungbo, null, false);

       // recyclerView = findViewById(R.id.recyclerView);
        daydatarecyclerview = inflate1.findViewById(R.id.daydatarecyclerview);

        linearLayoutManager = new LinearLayoutManager(this);

        daydatarecyclerview.addItemDecoration(
                new DividerItemDecoration(this,linearLayoutManager.getOrientation()));
        daydatarecyclerview.setLayoutManager(linearLayoutManager);
        recyclerViewAdapter = new Daydataadapter(this,listViewItems);
        daydatarecyclerview.setAdapter(recyclerViewAdapter);

        dia = new AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Light_Dialog_Alert);

        dia.setView(inflate1);

        dialo = dia.create();

        dialo.show();
        DaydataTongsin("20211023");

    }


    public void DaydataTongsin(String today) { // 서버 데이터를 가지고 온다 파라미터는 불러올 테이블 이름


        init();
        Daydatagithup gitHub = retrofit.create(Daydatagithup.class);
        Call<List<Daydatalistitem>> call = gitHub.contributors(today);
        call.enqueue(new Callback<List<Daydatalistitem>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            // 성공시
            public void onResponse(Call<List<Daydatalistitem>> call, Response<List<Daydatalistitem>> result) {
                List<Daydatalistitem> contributors = result.body();
                // 받아온 리스트를 순회하면서

                Log.e("Test888", result.body().toString());

                for (Daydatalistitem contributor : contributors) {


                    String jiyeoname = contributor.jiyeoname;
                    int total = contributor.total;
                    int singoga = contributor.singoga;
                    int singogayul = contributor.singogayul;



                    Log.e("dhxodn88", "" + jiyeoname + " / " + total + " / " + singoga +" / "+ singogayul);




                    listViewItems.add(new Daydatalistitem(jiyeoname, total, singoga,singogayul));
                   // Collections.sort(listViewItems);
                    recyclerViewAdapter.notifyDataSetChanged();

                }


            }

            @Override
            public void onFailure(Call<List<Daydatalistitem>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "정보받아오기 실패 " + t, Toast.LENGTH_LONG)
                        .show();

                Log.e("onFailure", "- > " + t);

            }
        });


    }
}