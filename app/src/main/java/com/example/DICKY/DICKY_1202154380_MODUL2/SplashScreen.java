package com.example.DICKY.DICKY_1202154380_MODUL2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    //durasi splashscreen
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //splashscreen fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //toash dengan nama_nim
        Toast.makeText(SplashScreen.this,"DICKY_1202154380",Toast.LENGTH_LONG).show();


        //menampilkan toast setelah muncul
        new Handler().postDelayed(new Runnable() {

                                    @Override
                                      public void run() {
                                          // TODO Auto-generated method stub

                                          //ketika selesai, intent digunakan setelah splashscreen
                                          Intent i = new Intent(SplashScreen.this, MainActivity.class);
                                          startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent


                                          //jeda splashscreen
                                          this.finish();
                                      }

                                      private void finish() {
                                          // TODO Auto-generated method stub

                                      }
                                  }, //jalankan timer interval sesuai parameter diatas
                splashInterval);

    };
    }

