package com.cralos.myapplication2.fragments.fonts.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.FragmentFontsBinding;
import com.cralos.myapplication2.fragments.fonts.adapters.UserAdapter;
import com.cralos.myapplication2.fragments.fonts.models.User;

import java.util.ArrayList;
import java.util.List;

public class FragmentFonts extends Fragment {
    public static final String TAG = FragmentFonts.class.getSimpleName();

    /*dataBinding*/
    private FragmentFontsBinding binding;

    /*adapter*/
    private UserAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fonts, container, false);
        initFragmentFonts();
        return binding.getRoot();
    }

    private void initFragmentFonts() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("Nombre " + i, "email " + i, "Trabajo " + i));
        }
        adapter = new UserAdapter(users, getContext());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setHasFixedSize(false);
        binding.recyclerView.setAdapter(adapter);


    }

}
