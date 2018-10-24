package com.example.lightning.matchingme;

/**
 * Created by lightning on 26/09/2018.
 */

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lightning on 12/09/2018.
 */

import java.util.ArrayList;
import java.util.List;

//public = kelas lain
//protect = kelas turunannya
//private = tidak bisa diakses di kelas lain dan turunannya


public class ImageAssets {


    public static List<Integer> bodies = new ArrayList<Integer>(){{


        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);
        add(R.drawable.body7);
    }};

    public static List<Integer> legs = new ArrayList<Integer>(){{


        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);
        add(R.drawable.legs5);

    }};

    //method yang digunakan untuk memanggil variable bodies.....
    public static List<Integer> getBodies(){
        return bodies;
    }

    //method yang digunakan untuk memanggil variable legs.....
    public static List<Integer> getlegs(){
        return legs;
    }


}

