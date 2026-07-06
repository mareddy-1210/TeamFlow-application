package com.Teamflow.backend.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "rca")
public class RCA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cause;
    public RCA() {
    }
    public RCA(Long id, String cause) {
        this.id = id;
        this.cause = cause;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
}
