package com.example.Pranvi.s_movie_review_system.Service;

import com.example.Pranvi.s_movie_review_system.Model.Review;
import com.example.Pranvi.s_movie_review_system.Repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepo reviewRepository;

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long reviewId, Review updatedReview) {
        Review review = reviewRepository.findById(reviewId).orElse(null);
        if (review != null) {
            review.setComment(updatedReview.getComment());
            review.setRating(updatedReview.getRating());
            return reviewRepository.save(review);
        }
        return null;
    }
}
