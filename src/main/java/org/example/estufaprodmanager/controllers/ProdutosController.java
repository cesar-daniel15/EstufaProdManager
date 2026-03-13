package org.example.estufaprodmanager.controllers;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.models.Produtos;
import org.example.estufaprodmanager.services.LogsService;
import org.example.estufaprodmanager.services.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/produtos")

public class ProdutosController {

    @Autowired
    private ProdutosService services;

    // Get
    @GetMapping()
    public List<Produtos> getAll(){
        return services.getAll();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Produtos> getById(@PathVariable UUID id) {
        return services.getById(id);
    }


    // Post
    @PostMapping()
    public Produtos create(@RequestBody Produtos produto) {
        return services.create(produto);
    }


    // Update
    @PutMapping("/{id}")
    public Produtos update(@PathVariable UUID id, @RequestBody Produtos produto) {
        return services.update(id, produto);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        services.delete(id);
    }
}
