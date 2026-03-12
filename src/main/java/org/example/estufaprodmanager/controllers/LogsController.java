package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/logs")
public class LogsController {
    @Autowired
    private LogsService services;

    // Get
    @GetMapping()
    public List<Logs> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Logs> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public Logs create(@RequestBody Logs log) {
        return services.create(log);
    }


    // Update
    @PutMapping("/{id}")
    public Logs update(@PathVariable UUID id, @RequestBody Logs log) {
        return services.update(id, log);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
