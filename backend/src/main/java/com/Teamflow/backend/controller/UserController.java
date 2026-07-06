package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.User;
import com.Teamflow.backend.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAll();
    }
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }
}