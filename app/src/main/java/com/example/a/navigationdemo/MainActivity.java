package com.example.a.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a.navigationdemo.ui.main.MainFragment;

import android.net.Uri;
public class MainActivity extends AppCompatActivity implements
        secondFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}

