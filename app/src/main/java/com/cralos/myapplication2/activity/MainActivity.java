package com.cralos.myapplication2.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.fragments.codingwithmitch.view.FragmentCodingwithmitch;
import com.cralos.myapplication2.fragments.fonts.view.FragmentFonts;
import com.cralos.myapplication2.fragments.searchview.withlistview.view.FragmentSearchview;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.withdatabinding.view.FragmentSearchViewWithDatabinding;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.withoutDatabinding.view.FragmentRvWithoutDataBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragmentCodingwithmitch();
    }

    private void showFragmentFont() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentFonts.TAG);
        transaction.replace(R.id.containerFragment, new FragmentFonts(), FragmentFonts.TAG).commit();
    }

    private void showFragmentSearchView() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentSearchview.TAG);
        transaction.replace(R.id.containerFragment, new FragmentSearchview(), FragmentSearchview.TAG).commit();
    }

    private void showFragmentRvWitouDatabinding() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentRvWithoutDataBinding.TAG);
        transaction.replace(R.id.containerFragment, new FragmentRvWithoutDataBinding(), FragmentRvWithoutDataBinding.TAG).commit();
    }

    private void showFragmentRvWithDatabinding() { /*SEARCHVIEW*/
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentSearchViewWithDatabinding.TAG);
        transaction.replace(R.id.containerFragment, new FragmentSearchViewWithDatabinding(), FragmentSearchViewWithDatabinding.TAG).commit();
    }

    private void showFragmentCodingwithmitch() {
        /**     this example is here: https://github.com/mitchtabian/DataBindingGettingStarted/     */
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack(FragmentCodingwithmitch.TAG);
        transaction.replace(R.id.containerFragment, new FragmentCodingwithmitch(), FragmentCodingwithmitch.TAG).commit();
    }

}
