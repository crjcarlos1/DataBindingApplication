package com.cralos.myapplication2.fragments.example1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.Fragment1Binding;
import com.cralos.myapplication2.fragments.example1.models.User;

public class Fragment1 extends Fragment {
    public static final String TAG = Fragment1.class.getSimpleName();

    private Fragment1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment1, container, false);
        View view = binding.getRoot();

        /*set user to dataBinding*/
        binding.setUserVar(new User("Juan Carlos Contreras","crjcarlos.1@gmail.com"));

        return view;
    }

}
