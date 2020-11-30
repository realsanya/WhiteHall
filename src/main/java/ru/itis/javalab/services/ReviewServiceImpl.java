package ru.itis.javalab.services;

import ru.itis.javalab.dto.ReviewDto;
import ru.itis.javalab.repositories.interfaces.ReviewReposiroty;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {

    private ReviewReposiroty reviewReposiroty;

    public ReviewServiceImpl(ReviewReposiroty reviewReposiroty) {
        this.reviewReposiroty = reviewReposiroty;
    }

    @Override
    public List<ReviewDto> getAllReviews() {
        return ReviewDto.from(reviewReposiroty.findAll());
    }

    @Override
    public List<ReviewDto> getAllReviewsByUserID(Integer user_id) {
        return ReviewDto.from(reviewReposiroty.findByUserID(user_id));
    }

    @Override
    public ReviewDto getReview(Integer id) {
        return ReviewDto.from(reviewReposiroty.findById(id));
    }

    @Override
    public ReviewDto addReview(ReviewDto review) {
        return ReviewDto.from(reviewReposiroty.findById(review.getId()));
    }
}
