package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Encomendas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.EncomendasService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/encomendas")

public class EncomendasController {

    @Autowired
    private EncomendasService services;

    // Get
    @GetMapping()
    public List<Encomendas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Encomendas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public Encomendas create(@RequestBody Encomendas encomenda) {
        return services.create(encomenda);
    }


    // Update
    @PutMapping("/{id}")
    public Encomendas update(@PathVariable UUID id, @RequestBody Encomendas encomenda) {
        return services.update(id, encomenda);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
