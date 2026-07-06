package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.Comment;
import com.Teamflow.backend.service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;
    public CommentController(CommentService service) {
        this.service = service;
    }
    @GetMapping
    public List<Comment> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Comment save(@RequestBody Comment comment) {
        return service.save(comment);
    }
}