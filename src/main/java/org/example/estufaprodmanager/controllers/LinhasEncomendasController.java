package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.LinhasEncomendas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.LinhasEncomendasService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/linhasEncomendas")

public class LinhasEncomendasController {

    @Autowired
    private LinhasEncomendasService services;

    // Get
    @GetMapping()
    public List<LinhasEncomendas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<LinhasEncomendas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public LinhasEncomendas create(@RequestBody LinhasEncomendas linha) {
        return services.create(linha);
    }

    // Update
    @PutMapping("/{id}")
    public LinhasEncomendas update(@PathVariable UUID id, @RequestBody LinhasEncomendas linha) {
        return services.update(id, linha);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
