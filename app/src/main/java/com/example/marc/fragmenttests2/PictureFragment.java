package com.example.marc.fragmenttests2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PictureFragment extends Fragment {

    private int[] pictureArray;
    ImageView picture;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.picture_fragment, container, false);
        //for loop to add all the pictures we have in the drawable folder
        pictureArray = new int[20];//should be the size of the number of pictures associated with story beats
        pictureArray[13] = R.drawable.storypic201;
        pictureArray[14] = R.drawable.storypic202;
        pictureArray[15] = R.drawable.storypic203;
        pictureArray[16] = R.drawable.storypic204;
        pictureArray[17] = R.drawable.storypic205;
        pictureArray[18] = R.drawable.storypic206;
        pictureArray[19] = R.drawable.storypic207;
        picture = (ImageView)view.findViewById(R.id.pic);
        return view;
    }

    public void setPicture(int adventure, int story)//there should be some parameters based on how the story progression works
    {
        if (story == -1)
            picture.setImageResource(R.drawable.storymenu);
        else if (adventure ==0){
            //Gerald's stories' pictures
        }
        else if (adventure ==1) {
            switch (story) {
                case (0): {
                    picture.setImageResource(pictureArray[13]);
                    break;
                }
                case (1): {
                    picture.setImageResource(pictureArray[14]);
                    break;
                }
                case (2): {
                    picture.setImageResource(pictureArray[15]);
                    break;
                }
                case (3): {
                    picture.setImageResource(pictureArray[16]);
                    break;
                }
                case (4): {
                    picture.setImageResource(pictureArray[17]);
                    break;
                }
                case (5): {
                    picture.setImageResource(pictureArray[18]);
                    break;
                }
                case (6): {
                    picture.setImageResource(pictureArray[19]);
                    break;
                }
            }
        }
        else if (adventure ==2){

        }
        else if (adventure==3){

        }
    }


}
