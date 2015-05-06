package com.example.marc.fragmenttests2;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ChoicesFragment extends Fragment {

    private Button[] btns;
    private int id;

    ChoicesListener activityCommander;

    public interface ChoicesListener {
        public void choice(int decision);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (ChoicesListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choices_fragment, container, false);
        id = R.id.yes_button;
        btns = new Button[2];
        for (int i = 0; i < btns.length; i++) {
            btns[i] = (Button) view.findViewById(id);
            btns[i].setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            buttonClicked(v);
                        }
                    }
            );
            id++;
        }
        return view;
    }

    public void buttonClicked(View view) {
        for (int i = 0; i < btns.length; i++) {
            if (view.equals(btns[i]))
                activityCommander.choice(i);
        }
    }

    public void setButtonText()
    {
        //Do this at some point.
    }

}
