package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Funcionalidades;
import org.example.estufaprodmanager.repositories.FuncionalidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FuncionalidadesService {

    @Autowired
    private FuncionalidadesRepository repository;

    // List
    public List<Funcionalidades> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Funcionalidades> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Funcionalidades create(Funcionalidades funcionalidade){
        return repository.save(funcionalidade);
    }

    // Update
    public Funcionalidades update(UUID id, Funcionalidades novaFuncionalidade){
        Optional<Funcionalidades> funcionalidadeExistente = repository.findById(id);

        if(funcionalidadeExistente.isPresent()){

            Funcionalidades funcionalidade = funcionalidadeExistente.get();

            funcionalidade.setNome(novaFuncionalidade.getNome());
            funcionalidade.setDescricao(novaFuncionalidade.getDescricao());

            return repository.save(funcionalidade);
        } else {
            throw new RuntimeException("Funcionalidade não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Erro ao apagar funcionalidade");
        }
    }
}