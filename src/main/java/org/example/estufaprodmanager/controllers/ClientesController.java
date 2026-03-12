package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Clientes;
import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.services.ClientesService;
import org.example.estufaprodmanager.services.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/clientes")

public class ClientesController {

    @Autowired
    private ClientesService services;

    // Get
    @GetMapping()
    public List<Clientes> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Clientes> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public Clientes create(@RequestBody Clientes cliente) {
        return services.create(cliente);
    }


    // Update
    @PutMapping("/{id}")
    public Clientes update(@PathVariable UUID id, @RequestBody Clientes cliente) {
        return services.update(id, cliente);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
