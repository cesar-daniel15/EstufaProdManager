package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.PerfisFuncionalidades;
import org.example.estufaprodmanager.services.PerfisFuncionalidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/perfilFuncionalidade")
public class PerfilsFuncionalidadesController {
    @Autowired
    private PerfisFuncionalidadesService services;

    // Get
    @GetMapping()
    public List<PerfisFuncionalidades> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<PerfisFuncionalidades> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public PerfisFuncionalidades create(@RequestBody PerfisFuncionalidades perfilFuncionalidade) {
        return services.create(perfilFuncionalidade);
    }

    // Put
    @PutMapping("/{id}")
    public PerfisFuncionalidades update(@PathVariable UUID id, @RequestBody PerfisFuncionalidades perfilFuncionalidade) {
        return services.update(id, perfilFuncionalidade);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
