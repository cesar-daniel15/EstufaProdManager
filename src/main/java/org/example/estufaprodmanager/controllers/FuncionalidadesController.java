package org.example.estufaprodmanager.controllers;


import org.example.estufaprodmanager.models.Funcionalidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.estufaprodmanager.services.FuncionalidadesService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/funcionalidades")
public class FuncionalidadesController {

    @Autowired
    private FuncionalidadesService services;

    // Get
    @GetMapping()
    public List<Funcionalidades> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Funcionalidades> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Funcionalidades create(@RequestBody Funcionalidades funcionalidade) {
        return services.create(funcionalidade);
    }

    // Put
    @PutMapping("/{id}")
    public Funcionalidades update(@PathVariable UUID id, @RequestBody Funcionalidades funcionalidade) {
        return services.update(id, funcionalidade);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
