package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.TaskRelation;
import com.Teamflow.backend.service.TaskRelationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/taskrelations")
public class TaskRelationController {
    private final TaskRelationService service;
    public TaskRelationController(TaskRelationService service) {
        this.service = service;
    }
    @GetMapping
    public List<TaskRelation> getAll() {
        return service.getAll();
    }
    @PostMapping
    public TaskRelation save(@RequestBody TaskRelation taskRelation) {
        return service.save(taskRelation);
    }
}