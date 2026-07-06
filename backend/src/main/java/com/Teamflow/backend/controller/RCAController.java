package com.Teamflow.backend.controller;
import com.Teamflow.backend.entity.RCA;
import com.Teamflow.backend.service.RCAService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/rcas")
public class RCAController {
    private final RCAService service;
    public RCAController(RCAService service) {
        this.service = service;
    }
    @GetMapping
    public List<RCA> getAll() {
        return service.getAll();
    }
    @PostMapping
    public RCA save(@RequestBody RCA rca) {
        return service.save(rca);
    }
}