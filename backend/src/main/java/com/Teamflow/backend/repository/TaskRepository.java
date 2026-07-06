package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long> {
}