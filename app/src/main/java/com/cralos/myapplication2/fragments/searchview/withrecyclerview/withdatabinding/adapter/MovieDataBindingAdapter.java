package com.cralos.myapplication2.fragments.searchview.withrecyclerview.withdatabinding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.ItemMovieWithDatabindingBinding;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.models.Movie;

import java.util.List;

public class MovieDataBindingAdapter extends RecyclerView.Adapter<MovieDataBindingAdapter.ViewHolder> {

    private List<Movie> movies;
    private Context context;

    public MovieDataBindingAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMovieWithDatabindingBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_movie_with_databinding, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setMovie(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemMovieWithDatabindingBinding binding;

        public ViewHolder(@NonNull ItemMovieWithDatabindingBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }

}
