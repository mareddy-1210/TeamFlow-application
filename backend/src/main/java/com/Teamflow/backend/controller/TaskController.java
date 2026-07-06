package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.Task;
import com.Teamflow.backend.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;
    public TaskController(TaskService service) {
        this.service = service;
    }
    @GetMapping
    public List<Task> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Task save(@RequestBody Task task) {
        return service.save(task);
    }
}