package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Utilizadores;
import org.example.estufaprodmanager.services.UtilizadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/utilizadores")
public class UtilizadoresController {

    @Autowired
    private UtilizadoresService services;

    // Get
    @GetMapping()
    public List<Utilizadores> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Utilizadores> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Utilizadores create(@RequestBody Utilizadores utilizador) {
        return services.create(utilizador);
    }

    // Put
    @PutMapping("/{id}")
    public Utilizadores update(@PathVariable UUID id, @RequestBody Utilizadores utilizador) {
        return services.update(id, utilizador);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
