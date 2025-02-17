package com.example.Pranvi.s_movie_review_system.Controller;

import com.example.Pranvi.s_movie_review_system.Model.Movie;
import com.example.Pranvi.s_movie_review_system.Model.Review;
import com.example.Pranvi.s_movie_review_system.Service.MovieService;
import com.example.Pranvi.s_movie_review_system.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/{movieId}/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private MovieService movieService;

    @PostMapping
    public Review addReview(@PathVariable Long movieId, @RequestBody Review review) {
        Movie movie = movieService.getMovieById(movieId);
        review.setMovie(movie);
        return reviewService.addReview(review);
    }

    @PutMapping("/reviews/{reviewId}")
    public Review updateReview(@PathVariable Long reviewId, @RequestBody Review updatedReview) {
        return reviewService.updateReview(reviewId, updatedReview);
    }
}
