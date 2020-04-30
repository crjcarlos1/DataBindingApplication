package com.cralos.myapplication2.fragments.searchview.withrecyclerview.utils;

import com.cralos.myapplication2.fragments.searchview.withrecyclerview.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesUtils {
    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Piedras", "2010", "México"));
        movies.add(new Movie("Alfabeto", "2010", "México"));
        movies.add(new Movie("Harry Pottdr", "2010", "México"));
        movies.add(new Movie("Francia", "2010", "México"));
        movies.add(new Movie("Tito", "2010", "México"));
        movies.add(new Movie("Escritorio", "2010", "México"));
        movies.add(new Movie("Palacio", "2010", "México"));
        movies.add(new Movie("Puerta", "2010", "México"));
        movies.add(new Movie("Victoria", "2010", "México"));
        movies.add(new Movie("Tamales", "2010", "México"));
        movies.add(new Movie("Vaca", "2010", "México"));
        movies.add(new Movie("Laberinto", "2010", "México"));
        movies.add(new Movie("Android", "2010", "México"));
        movies.add(new Movie("Ios", "2010", "México"));
        movies.add(new Movie("Trauma", "2010", "México"));
        movies.add(new Movie("Amar", "2010", "México"));
        movies.add(new Movie("Fluidos", "2010", "México"));
        movies.add(new Movie("Libreta", "2010", "México"));
        movies.add(new Movie("Flan", "2010", "México"));
        movies.add(new Movie("Amaranto", "2010", "México"));
        return movies;
    }
}
