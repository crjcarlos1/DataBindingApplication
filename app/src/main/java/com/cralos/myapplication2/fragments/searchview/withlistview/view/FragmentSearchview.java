package com.cralos.myapplication2.fragments.searchview.withlistview.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.FragmentSearchviewBinding;
import com.cralos.myapplication2.fragments.searchview.withlistview.adapters.ListAdapter;
import com.cralos.myapplication2.fragments.searchview.withlistview.models.User;

import java.util.ArrayList;
import java.util.List;

public class FragmentSearchview extends Fragment {
    public static final String TAG = FragmentSearchview.class.getSimpleName();

    /*dataBinding*/
    private FragmentSearchviewBinding binding;

    /*Adapter*/
    private ListAdapter adapter;

    /*usersList*/
    private List<User> userList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_searchview, container, false);
        initFragmentSearchView();
        return binding.getRoot();
    }

    private void initFragmentSearchView() {
        userList = new ArrayList<>();
        userList.add(new User("Alicia", "lastName", 0));
        userList.add(new User("Alvaro", "lastName", 0));
        userList.add(new User("Daniel", "lastName", 0));
        userList.add(new User("David", "lastName", 0));
        userList.add(new User("Donovan", "lastName", 0));
        userList.add(new User("Damaris", "lastName", 0));
        userList.add(new User("Carlos", "lastName", 0));
        userList.add(new User("Claudia", "lastName", 0));
        userList.add(new User("Jaqueline", "lastName", 0));
        userList.add(new User("Juan", "lastName", 0));

        adapter = new ListAdapter(userList);
        binding.listView.setAdapter(adapter);

        binding.searchView.setActivated(true);
        binding.searchView.setQueryHint("Escribe tu nombre");
        binding.searchView.onActionViewExpanded();
        binding.searchView.setIconified(false);
        binding.searchView.clearFocus();

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

}
