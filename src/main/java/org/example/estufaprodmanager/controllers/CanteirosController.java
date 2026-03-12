package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Canteiros;
import org.example.estufaprodmanager.models.Horticolas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.CanteirosService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/canteiros")

public class CanteirosController {

    @Autowired
    private CanteirosService services;

    // Get
    @GetMapping()
    public List<Canteiros> getAll(){
        return services.getAll();
    }

    // By Id
    @GetMapping("/{id}")
    public Optional<Canteiros> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Canteiros create(@RequestBody Canteiros canteiro) {
        return services.create(canteiro);
    }

    // Update
    @PutMapping("/{id}")
    public Canteiros update(@PathVariable UUID id, @RequestBody Canteiros canteiro) {
        return services.update(id, canteiro);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }

}
