package com.Teamflow.backend.service;
import com.Teamflow.backend.entity.Notification;
import com.Teamflow.backend.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NotificationService {
    private final NotificationRepository repository;
    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }
    public List<Notification> getAll() {
        return repository.findAll();
    }
    public Notification save(Notification notification) {
        return repository.save(notification);
    }
}