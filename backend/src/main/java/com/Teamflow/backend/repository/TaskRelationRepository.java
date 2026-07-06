package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.TaskRelation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRelationRepository extends JpaRepository<TaskRelation, Long> {
}