package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.Project;
import com.Teamflow.backend.service.ProjectService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService service;
    public ProjectController(ProjectService service) {
        this.service = service;
    }
    @GetMapping
    public List<Project> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Project save(@RequestBody Project project) {
        return service.save(project);
    }
}