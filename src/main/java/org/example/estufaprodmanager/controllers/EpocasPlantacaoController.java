package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.EpocasPlantacao;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.EpocasPlantacaoService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/epocasPlantacao")

public class EpocasPlantacaoController {

    @Autowired
    private EpocasPlantacaoService services;

    // Get
    @GetMapping()
    public List<EpocasPlantacao> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<EpocasPlantacao> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public EpocasPlantacao create(@RequestBody EpocasPlantacao epoca) {
        return services.create(epoca);
    }


    // Update
    @PutMapping("/{id}")
    public EpocasPlantacao update(@PathVariable UUID id, @RequestBody EpocasPlantacao epoca) {
        return services.update(id, epoca);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
