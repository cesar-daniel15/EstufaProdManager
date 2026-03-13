package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.PerfisFuncionalidades;
import org.example.estufaprodmanager.repositories.PerfisFuncionalidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PerfisFuncionalidadesService {
    @Autowired
    private PerfisFuncionalidadesRepository repository;

    // List
    public List<PerfisFuncionalidades> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<PerfisFuncionalidades> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public PerfisFuncionalidades create(PerfisFuncionalidades perfilFuncionalidade){
        return repository.save(perfilFuncionalidade);
    }

    // Update
    public PerfisFuncionalidades update(UUID id, PerfisFuncionalidades novoPerfilFuncionalidade){
        Optional<PerfisFuncionalidades> perfilFuncionalidadeExistente = repository.findById(id);

        if(perfilFuncionalidadeExistente.isPresent()){

            PerfisFuncionalidades perfilFuncionalidade = perfilFuncionalidadeExistente.get();

            perfilFuncionalidade.setIdPerfil(novoPerfilFuncionalidade.getIdPerfil());
            perfilFuncionalidade.setIdFuncionalidade(novoPerfilFuncionalidade.getIdFuncionalidade());

            return repository.save(perfilFuncionalidade);
        } else {
            throw new RuntimeException("Perfil Funcionalidade não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Erro ao apagar perfil funcionalidade");
        }
    }
}
