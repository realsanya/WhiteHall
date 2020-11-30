package ru.itis.javalab.services;

import ru.itis.javalab.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> getAllReviews();

    List<ReviewDto> getAllReviewsByUserID(Integer user_id);

    ReviewDto getReview(Integer id);

    ReviewDto addReview(ReviewDto review);
}
