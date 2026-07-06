package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ReviewRepository extends JpaRepository<Review, Long> {
}