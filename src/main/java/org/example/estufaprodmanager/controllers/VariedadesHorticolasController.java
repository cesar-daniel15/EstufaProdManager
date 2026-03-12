package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Plantacoes;
import org.example.estufaprodmanager.models.VariedadesHorticolas;
import org.example.estufaprodmanager.services.PlantacoesService;
import org.example.estufaprodmanager.services.VariedadesHorticolasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/variedadesHorticolas")

public class VariedadesHorticolasController {

    @Autowired
    private VariedadesHorticolasService services;

    // Get
    @GetMapping()
    public List<VariedadesHorticolas> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<VariedadesHorticolas> getById(@PathVariable UUID id) {
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public VariedadesHorticolas create(@RequestBody VariedadesHorticolas variedade) {
        return services.create(variedade);
    }

    // Update
    @PutMapping("/{id}")
    public VariedadesHorticolas update(@PathVariable UUID id, @RequestBody VariedadesHorticolas variedade) {
        return services.update(id, variedade);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
