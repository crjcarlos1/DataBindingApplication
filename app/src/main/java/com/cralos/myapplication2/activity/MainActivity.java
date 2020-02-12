package com.cralos.myapplication2.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.fragments.fonts.view.FragmentFonts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragmentFont();
    }

    private void showFragmentFont() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentFonts.TAG);
        transaction.replace(R.id.containerFragment, new FragmentFonts(), FragmentFonts.TAG).commit();
    }

}
