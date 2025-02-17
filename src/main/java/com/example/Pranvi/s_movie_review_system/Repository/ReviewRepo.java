package com.example.Pranvi.s_movie_review_system.Repository;

import com.example.Pranvi.s_movie_review_system.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
