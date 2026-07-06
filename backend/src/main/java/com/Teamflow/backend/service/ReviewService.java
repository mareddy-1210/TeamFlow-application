package com.Teamflow.backend.service;
import com.Teamflow.backend.entity.Review;
import com.Teamflow.backend.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ReviewService {
    private final ReviewRepository repository;
    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }
    public List<Review> getAll() {
        return repository.findAll();
    }
    public Review save(Review review) {
        return repository.save(review);
    }
}