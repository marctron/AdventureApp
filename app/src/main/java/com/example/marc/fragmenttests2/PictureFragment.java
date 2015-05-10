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
        pictureArray = new int[1];//should be the size of the number of pictures we have
        pictureArray[0] = R.drawable.title;//just an example, this will be where you assign the values of the pictures
        picture = (ImageView)view.findViewById(R.id.pic);
        return view;
    }

    public void setPicture()//there should be some parameters based on how the story progression works
    {
        picture.setImageResource(pictureArray[0]);//the hardcoded int can be changed to on of the parameters
    }


}
