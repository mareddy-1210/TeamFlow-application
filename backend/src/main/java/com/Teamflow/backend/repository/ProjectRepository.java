package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
