package com.example.DICKY.DICKY_1202154380_MODUL2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button a ;
    private RadioGroup b;
    private RadioButton c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //title menu awal
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbarmain);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dicky - Western Cafe");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //inisiasi pada layout mulai dari button sampai radiobutton

        a = (Button) findViewById(R.id.pesan);

        b = (RadioGroup) findViewById(R.id.pilihmenu);

        c = (RadioButton) findViewById(R.id.dine);

        d = (RadioButton) findViewById(R.id.take);



    }

    //memberikan aksi pada setiap radiobutton
    public void pesan(View view) {

        b = (RadioGroup) findViewById(R.id.pilihmenu);

        c = (RadioButton) findViewById(R.id.dine);

        d = (RadioButton) findViewById(R.id.take);

    }

    public void pilih(View view) {

        //mengaktifkan radio button agar bisa dipilih
        int selecteditem = b.getCheckedRadioButtonId();

        //ketika Dine In dipilih toast dilakukan
        if (selecteditem == c.getId()){
            Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();

            //intent menuju DineIn.class
            Intent a = new Intent(MainActivity.this,DineIn.class);
            startActivity(a);
        }
        else if (selecteditem == d.getId()){
            Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();

            //intent menuju TakeAway.class
            Intent a = new Intent(MainActivity.this,TakeAway.class);
            startActivity(a);
        }

    }

    public void pilihpemesanan(View view) {
       //cek button
        boolean checked = ((RadioButton) view).isChecked();

      //cek button ketika diklik
        switch(view.getId()) {
            case R.id.take:
                if (checked)
                    //menampilkan pesan dan pindah ke TakeAway
                    take();
                    break;
            case R.id.dine:
                if (checked)
                    //menampilkan pesan dan pindah ke Dine In
                    dine();
                    break;
        }
    }

    private void dine() {
        //menampilkan pesan
        Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();
        //pindah layout
        Intent a = new Intent(MainActivity.this,DineIn.class);
        startActivity(a);
    }

    private void take() {
        Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();
        Intent a = new Intent(MainActivity.this,TakeAway.class);
        startActivity(a);
    }
}
