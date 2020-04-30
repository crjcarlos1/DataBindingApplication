package com.cralos.myapplication2.fragments.searchview.withrecyclerview.withdatabinding.view;

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
import com.cralos.myapplication2.databinding.FragmentRvWithDatabindingBinding;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.utils.MoviesUtils;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.withdatabinding.adapter.MovieDataBindingAdapter;

public class FragmentSearchViewWithDatabinding extends Fragment {
    public static final String TAG = FragmentSearchViewWithDatabinding.class.getSimpleName();

    /*dataBinding*/
    private FragmentRvWithDatabindingBinding binding;

    /*adapter*/
    private MovieDataBindingAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rv_with_databinding, container, false);
        initFragmentRvWithDataBinding();
        return binding.getRoot();
    }

    private void initFragmentRvWithDataBinding() {
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        adapter = new MovieDataBindingAdapter(MoviesUtils.getMovies(), getContext());
        binding.recyclerViewDataBinding.setHasFixedSize(false);
        binding.recyclerViewDataBinding.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerViewDataBinding.setAdapter(adapter);
    }

}
