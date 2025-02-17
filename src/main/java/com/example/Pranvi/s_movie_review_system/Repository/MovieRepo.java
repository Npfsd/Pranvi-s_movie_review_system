package com.example.Pranvi.s_movie_review_system.Repository;

import com.example.Pranvi.s_movie_review_system.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
