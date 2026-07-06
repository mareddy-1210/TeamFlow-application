package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.Review;
import com.Teamflow.backend.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService service;
    public ReviewController(ReviewService service) {
        this.service = service;
    }
    @GetMapping
    public List<Review> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Review save(@RequestBody Review review) {
        return service.save(review);
    }
}
