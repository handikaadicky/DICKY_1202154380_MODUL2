package com.example.DICKY.DICKY_1202154380_MODUL2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private TextInputLayout a,b;
    private Spinner c;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //title toolbar sewaktu masuk dine in
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //inisiasi untuk Spinner

        c = (Spinner) findViewById(R.id.nomeja);

        //panggil array untuk ditampung dan ditampilkan di spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (c != null){
            c.setAdapter(adapter);
        }

    }

    public void pilihpesanan(View view) {

        //inisiasi untuk TextInputLayot

        a = (TextInputLayout) findViewById(R.id.nama);

        //membuat string test agar spinner dapat dipilih
        String test = c.getSelectedItem().toString();

        //jika spinner null
        if (a ==null){
            Toast.makeText(this,"Silahkan di Isi terlebih dahulu",Toast.LENGTH_LONG).show();
        }
        //ketika meja 1 dipilih toast dilakukan
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //ketika meja 2 dipilih toast dilakukan
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //ketika meja 3 dipilih toast dilakukan
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //ketika meja 4 dipilih toast dilakukan
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //ketika meja 5 dipilih toast dilakukan
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }

        //mengirim nama+jumlah untuk bisa dikirim melalui intent supaya bisa diget fitur selanjutnya
        Intent a = new Intent(DineIn.this,ListPesanan.class);
        startActivity(a);

    }
}
