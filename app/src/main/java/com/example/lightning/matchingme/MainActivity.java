package com.example.lightning.matchingme;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null) {
            //inisiasi adapter untuk mengaktifkan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();

            //transaksi fragment
            //inisiasi object bertipe BodypartFragment
            BodyPartsFragment bodyFragment;

            //membuat object untuk Body
            bodyFragment  = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            //transaksi fragment
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

            //dicoba sendiri
            //fragmentManager.beginTransaction().remove()

            //membuat object untuk Legs
            bodyFragment  = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getlegs());
            bodyFragment.setmListIndex(0);
            //transaksi fragment
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();
        }

    }
}
