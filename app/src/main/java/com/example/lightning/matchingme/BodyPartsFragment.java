package com.example.lightning.matchingme;

/**
 * Created by lightning on 26/09/2018.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsFragment extends Fragment {
    private static final String TAG = "BodyPartFragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";


    public   void BodyPartsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(savedInstanceState != null) {

            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }
        //inisiasi activity tersebut sebagai fragment
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment,container,false);

        //No referensi id yang ada di layout fragment
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView_body_part_layout_fragment);

        //ambil gambar untuk ditampilkan
//        imageView.setImageResource(ImageAssets.getHeads().get(0));
        imageView.setImageResource(mImageIds.get(mListIndex));


        //return super.onCreateView(inflater,container,savedInstanceState);

        imageView.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                if(mListIndex < mImageIds.size()-1) {

                    mListIndex++;

                } else {


                    mListIndex = 0;

                }


                imageView.setImageResource(mImageIds.get(mListIndex));

            }

        });
        return rootView;
    }
    //untuk memanggil list gambar
    private List<Integer> mImageIds;
    private Integer mListIndex;
    public  void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }
    public  void setmListIndex(Integer mListIndex) {
        this.mListIndex=mListIndex;
    }


    public void onSaveInstanceState(Bundle currentState) {

        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);

    }


}


