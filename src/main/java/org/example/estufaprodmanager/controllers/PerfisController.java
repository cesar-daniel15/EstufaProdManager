package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Perfis;
import org.example.estufaprodmanager.services.PerfisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/perfis")
public class PerfisController {

    @Autowired
    private PerfisService services;

    // Get
    @GetMapping()
    public List<Perfis> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Perfis> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Perfis create(@RequestBody Perfis perfil) {
        return services.create(perfil);
    }

    // Put
    @PutMapping("/{id}")
    public Perfis update(@PathVariable UUID id, @RequestBody Perfis perfil) {
        return services.update(id, perfil);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
