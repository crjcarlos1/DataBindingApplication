package com.cralos.myapplication2.fragments.searchview.withrecyclerview.withoutDatabinding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.fragments.searchview.withrecyclerview.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movies;
    private Context context;

    public MovieAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_without_databinding, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txvName.setText(movies.get(position).getName());
        holder.txvYear.setText(movies.get(position).getYear());
        holder.txvCountry.setText(movies.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public void setSearchOperation(List<Movie> newList) {
        movies = newList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txvName, txvYear, txvCountry;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txvName = itemView.findViewById(R.id.txvName);
            txvYear = itemView.findViewById(R.id.txvYear);
            txvCountry = itemView.findViewById(R.id.txvCountry);
        }
    }

}
