package com.Teamflow.backend.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "task_relations")
public class TaskRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String relationType;
    public TaskRelation() {
    }
    public TaskRelation(Long id, String relationType) {
        this.id = id;
        this.relationType = relationType;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRelationType() {
        return relationType;
    }
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }
}