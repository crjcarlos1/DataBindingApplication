package com.cralos.myapplication2.fragments.searchview.withrecyclerview.withdatabinding.bindingadapters;

import android.util.Log;
import android.widget.SearchView;

import androidx.databinding.BindingAdapter;

public class SearchViewAdapter {

    /**
     *
     *
     *
     *      En este branch solo falta actualizar el recycler con los datos filtrados con el searchView
     *      usdamdo DATABINDING
     *
     *
     *
     *
     *
     *
     *
     */



    public String query;

    @BindingAdapter("android:myQuery")
    public static void setQuery(SearchView searchView, String queryText) {
        searchView.setQuery(queryText, false);
    }

    @BindingAdapter("android:queryTextListener")
    public static void setOnQueryTextListener(SearchView searchView, SearchView.OnQueryTextListener listener) {
        listener = onQueryTextListener;
        searchView.setOnQueryTextListener(listener);
    }

    public static SearchView.OnQueryTextListener getOnQueryTextListener() {
        return onQueryTextListener;
    }

    private static SearchView.OnQueryTextListener onQueryTextListener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            Log.e("MY_SEARCHVIEW", "query = " + query); // <- query is empty.
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            Log.e("MY_SEARCHVIEW", "query = " + newText); // <- query is empty.
            return false;
        }
    };

}
