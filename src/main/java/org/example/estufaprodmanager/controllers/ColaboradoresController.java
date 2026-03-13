package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Colaboradores;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.ColaboradoresService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/colaboradores")

public class ColaboradoresController {

    @Autowired
    private ColaboradoresService services;

    // Get
    @GetMapping()
    public List<Colaboradores> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Colaboradores> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public Colaboradores create(@RequestBody Colaboradores colaborador) {
        return services.create(colaborador);
    }


    // Update
    @PutMapping("/{id}")
    public Colaboradores update(@PathVariable UUID id, @RequestBody Colaboradores colaborador) {
        return services.update(id, colaborador);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
