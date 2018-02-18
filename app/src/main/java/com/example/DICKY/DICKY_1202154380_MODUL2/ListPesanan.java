package com.example.DICKY.DICKY_1202154380_MODUL2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //Menu Makanan
    private String[] Judul = {"Beef Steak", "Burger","Hot Dog","King Rach Chicken","Nachos","Potato",
            "Ramen","Salibury Steak","Salmon","Teriyaki Chicken"};
    //Harga
    private String[] test = {"Rp. 50.000", "Rp. 25.000","Rp. 25.000","Rp. 85.000","Rp. 15.000","Rp. 20.000","Rp. 30.000","Rp. 45.000",
    "Rp. 100.000","Rp. 40.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.beefsteak, R.drawable.burger,R.drawable.hotdog,R.drawable.kingrachchicken,R.drawable.nachos,
    R.drawable.potato,R.drawable.ramen,R.drawable.saliburysteak,R.drawable.salmon,R.drawable.teriyakichicken};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //setting title pada list makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //deklarasi array menu + harga
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();
//        iniDataMenu();
//        iniDataHarga();
//        initgambar();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Penggunaan LinearLayoutManager untuk list standar
         * dilist dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);
    }

    //ambil variable gambar+ harga -> pasang ke list class adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }

}
