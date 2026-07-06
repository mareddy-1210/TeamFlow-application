package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.Notification;
import com.Teamflow.backend.service.NotificationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService service;
    public NotificationController(NotificationService service) {
        this.service = service;
    }
    @GetMapping
    public List<Notification> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Notification save(@RequestBody Notification notification) {
        return service.save(notification);
    }
}