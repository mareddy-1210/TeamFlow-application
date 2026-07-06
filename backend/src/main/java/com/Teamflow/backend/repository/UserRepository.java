package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
