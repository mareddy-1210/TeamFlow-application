package com.Teamflow.backend.service;

import com.Teamflow.backend.entity.Project;
import com.Teamflow.backend.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getAll() {
        return repository.findAll();
    }

    public Project save(Project project) {
        return repository.save(project);
    }
}