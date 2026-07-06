package com.Teamflow.backend.service;
import com.Teamflow.backend.entity.Comment;
import com.Teamflow.backend.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CommentService {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }
    public List<Comment> getAll() {
        return repository.findAll();
    }
    public Comment save(Comment comment) {
        return repository.save(comment);
    }
}