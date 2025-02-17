package com.example.Pranvi.s_movie_review_system.Service;

import com.example.Pranvi.s_movie_review_system.Model.Movie;
import com.example.Pranvi.s_movie_review_system.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(Long movieId) {
        return movieRepository.findById(movieId).orElse(null);
    }
}