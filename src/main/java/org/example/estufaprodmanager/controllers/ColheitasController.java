package org.example.estufaprodmanager.controllers;


import org.example.estufaprodmanager.models.Colheitas;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.ColheitasService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/colheitas")

public class ColheitasController {
    @Autowired
    private ColheitasService services;

    // Get
    @GetMapping()
    public List<Colheitas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Colheitas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public Colheitas create(@RequestBody Colheitas colheita) {
        return services.create(colheita);
    }

    // Update
    @PutMapping("/{id}")
    public Colheitas update(@PathVariable UUID id, @RequestBody Colheitas colheita) {
        return services.update(id, colheita);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }


}
