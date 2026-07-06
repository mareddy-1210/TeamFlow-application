package com.Teamflow.backend.service;
import com.Teamflow.backend.entity.RCA;
import com.Teamflow.backend.repository.RCARepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RCAService {
    private final RCARepository repository;

    public RCAService(RCARepository repository) {
        this.repository = repository;
    }

    public List<RCA> getAll() {
        return repository.findAll();
    }

    public RCA save(RCA rca) {
        return repository.save(rca);
    }
}