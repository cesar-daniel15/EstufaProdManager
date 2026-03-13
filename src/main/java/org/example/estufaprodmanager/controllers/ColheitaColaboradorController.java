package org.example.estufaprodmanager.controllers;


import org.example.estufaprodmanager.models.ColheitaColaborador;
import org.example.estufaprodmanager.services.ColheitaColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/colheitaColaborador")
public class ColheitaColaboradorController {
    @Autowired
    private ColheitaColaboradorService services;

    // Get
    @GetMapping()
    public List<ColheitaColaborador> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<ColheitaColaborador> getById(@PathVariable UUID id){
        return services.getById(id);
    }

    // Post
    @PostMapping()
    public ColheitaColaborador create (@RequestBody ColheitaColaborador colheitaColaborador){
        return services.create(colheitaColaborador);
    }

    //Update
    @PutMapping("/{id}")
    public void delete(@PathVariable UUID id){
        services.delete(id);
    }

}

