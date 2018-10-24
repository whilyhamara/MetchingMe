package com.example.lightning.matchingme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//menerapkan layout activity Cover yang dipilih
        setContentView(R.layout.activity_cover);
    }
//method untuk intent ke mainActivity
    public void goToActivity2 (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
