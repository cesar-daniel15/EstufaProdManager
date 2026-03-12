package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Estufas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.EstufasService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/estufas")

public class EstufasController {

    @Autowired
    private EstufasService services;

    // Get
    @GetMapping()
    public List<Estufas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Estufas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Estufas create(@RequestBody Estufas estufa) {
        return services.create(estufa);
    }


    // Update
    @PutMapping("/{id}")
    public Estufas update(@PathVariable UUID id, @RequestBody Estufas estufa) {
        return services.update(id, estufa);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
