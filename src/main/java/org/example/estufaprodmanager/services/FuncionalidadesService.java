package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Funcionalidades;
import org.example.estufaprodmanager.repositories.FuncionalidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionalidadesService {

    @Autowired
    private FuncionalidadesRepository repository;

    // List
    public List<Funcionalidades> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Funcionalidades> getById(String id){
        return repository.findById(id);
    }

    // Create
    public Funcionalidades save(Funcionalidades entity){
        return entity;
    }

    // Delete
    public void delete(String id){
        repository.deleteById(id);
    }
}