package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Horticolas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.HorticolasService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/horticolas")

public class HorticolasController {

    @Autowired
    private HorticolasService services;

    // Get
    @GetMapping()
    public List<Horticolas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Horticolas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Horticolas create(@RequestBody Horticolas horticola) {
        return services.create(horticola);
    }


    // Update
    @PutMapping("/{id}")
    public Horticolas update(@PathVariable UUID id, @RequestBody Horticolas horticola) {
        return services.update(id, horticola);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
