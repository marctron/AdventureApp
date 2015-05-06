package com.example.marc.fragmenttests2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LogFragment extends Fragment {

    private TextView t;
    private String in, stream;
    public LogFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.text_log_fragment, container, false);
        in = "<";
        t = (TextView) view.findViewById(R.id.log);
        stream = "";
        question();
        return view;
    }

    public void question()
    {
        stream = ">Do you love the Robocop?\n" + stream;
        t.setText(stream);
    }

    public void addText(int num)
    {
        String str[] = new String[3];
        stream = t.getText().toString();
        str[0] = "Yes";
        str[1] = "No";
        str[2] = "Maybe";
        stream = in + str[num] + "\n" + stream;
        t.setText(stream);
        question();
    }
}
