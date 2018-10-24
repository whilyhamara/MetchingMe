package com.example.lightning.matchingme;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lightning on 26/09/2018.
 */

public class SplashActivity extends AppCompatActivity {
//inisialisasi lama splashscreen akan ditampilkan
    private final static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//membuat handler untuk memberi jeda waktu untuk bisa membuka (intent) ke activityCover
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Cover.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT); //memanggil variabel untuk waktu delay
    }
}
