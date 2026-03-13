package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.InspecoesQualidade;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.InspecoesQualidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/inspecoesQualidade")
public class InspecoesQualidadeController {
    @Autowired
    private InspecoesQualidadeService services;

    // Get
    @GetMapping()
    public List<InspecoesQualidade> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<InspecoesQualidade> getById(@PathVariable UUID id){
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public InspecoesQualidade create(@RequestBody InspecoesQualidade inspecao) {
        return services.create(inspecao);
    }

    // Update
    @PutMapping("/{id}")
    public InspecoesQualidade update(@PathVariable UUID id, @RequestBody InspecoesQualidade inspecao) {
        return services.update(id, inspecao);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }

}

