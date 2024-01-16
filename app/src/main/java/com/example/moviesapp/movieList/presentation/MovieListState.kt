package com.example.moviesapp.movieList.presentation

import com.example.moviesapp.movieList.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,

    val popularMoviesListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    val isCurrentPopularScreen: Boolean = true,

    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)