package com.example.marc.fragmenttests2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class GameEnvironment extends ActionBarActivity implements ChoicesFragment.ChoicesListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_environment);
    }

//registers the selection and passes it over to the log fragment
    @Override
    public void choice(int decision) {
        LogFragment log = (LogFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        log.addText(decision);
    }


}
