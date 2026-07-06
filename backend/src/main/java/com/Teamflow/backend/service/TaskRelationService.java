package com.Teamflow.backend.service;
import com.Teamflow.backend.entity.TaskRelation;
import com.Teamflow.backend.repository.TaskRelationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TaskRelationService {

    private final TaskRelationRepository repository;

    public TaskRelationService(TaskRelationRepository repository) {
        this.repository = repository;
    }

    public List<TaskRelation> getAll() {
        return repository.findAll();
    }

    public TaskRelation save(TaskRelation taskRelation) {
        return repository.save(taskRelation);
    }
}