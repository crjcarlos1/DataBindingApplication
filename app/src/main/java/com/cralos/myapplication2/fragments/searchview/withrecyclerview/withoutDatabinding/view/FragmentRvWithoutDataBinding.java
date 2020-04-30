package com.cralos.myapplication2.fragments.searchview.withrecyclerview.withoutDatabinding.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.models.Movie;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.withoutDatabinding.adapter.MovieAdapter;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.utils.MoviesUtils;

import java.util.ArrayList;
import java.util.List;

public class FragmentRvWithoutDataBinding extends Fragment implements SearchView.OnQueryTextListener {
    public static final String TAG = FragmentRvWithoutDataBinding.class.getSimpleName();

    private SearchView searchView;
    private RecyclerView recyclerView;
    private MovieAdapter adapter;

    private List<Movie> movies;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rv_without_databinding, container, false);
        initFragmentRvWithoutDb(view);
        return view;
    }

    private void initFragmentRvWithoutDb(View view) {
        searchView = view.findViewById(R.id.searchviewwithoutdb);
        recyclerView = view.findViewById(R.id.recyclerView);

        movies = MoviesUtils.getMovies();
        adapter = new MovieAdapter(movies, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(this);
        searchView.setActivated(true);
        searchView.setQueryHint("Escribe nombre de película...");
        searchView.onActionViewExpanded();
        searchView.setIconified(false);
        searchView.clearFocus();

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        newText = newText.toUpperCase();
        List<Movie> myList = new ArrayList<>();
        for (Movie movie : movies) {
            String name = movie.getName().toUpperCase();
            if (name.contains(newText)) {
                myList.add(movie);
            }
            adapter.setSearchOperation(myList);
        }
        return false;
    }

}
