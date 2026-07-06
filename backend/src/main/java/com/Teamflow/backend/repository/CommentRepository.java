package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
