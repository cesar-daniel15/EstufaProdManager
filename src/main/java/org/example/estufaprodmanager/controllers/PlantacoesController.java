package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.models.Plantacoes;
import org.example.estufaprodmanager.services.LogsService;
import org.example.estufaprodmanager.services.PlantacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/plantacoes")

public class PlantacoesController {

    @Autowired
    private PlantacoesService services;

    // Get
    @GetMapping()
    public List<Plantacoes> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Plantacoes> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Plantacoes create(@RequestBody Plantacoes plantacao) {
        return services.create(plantacao);
    }


    // Update
    @PutMapping("/{id}")
    public Plantacoes update(@PathVariable UUID id, @RequestBody Plantacoes plantacao) {
        return services.update(id, plantacao);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
