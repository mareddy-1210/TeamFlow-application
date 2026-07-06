package com.Teamflow.backend.repository;
import com.Teamflow.backend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}