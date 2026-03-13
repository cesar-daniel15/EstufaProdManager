package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.models.Monitorizacoes;
import org.example.estufaprodmanager.services.LogsService;
import org.example.estufaprodmanager.services.MonitorizacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/monitorizacoes")

public class MonitorizacoesController {

    @Autowired
    private MonitorizacoesService services;

    // Get
    @GetMapping()
    public List<Monitorizacoes> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Monitorizacoes> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Monitorizacoes create(@RequestBody Monitorizacoes monitorizacao) {
        return services.create(monitorizacao);
    }


    // Update
    @PutMapping("/{id}")
    public Monitorizacoes update(@PathVariable UUID id, @RequestBody Monitorizacoes monitorizacao) {
        return services.update(id, monitorizacao);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
