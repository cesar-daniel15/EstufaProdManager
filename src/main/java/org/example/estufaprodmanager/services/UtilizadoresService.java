package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Funcionalidades;
import org.example.estufaprodmanager.models.Utilizadores;
import org.example.estufaprodmanager.repositories.FuncionalidadesRepository;
import org.example.estufaprodmanager.repositories.UtilizadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UtilizadoresService {

    @Autowired
    private UtilizadoresRepository repository;

    // List
    public List<Utilizadores> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Utilizadores> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Utilizadores create(Utilizadores utilizadores){
        return repository.save(utilizadores);
    }

    // Update
    public Utilizadores update(UUID id, Utilizadores novoUtilizador){
        Optional<Utilizadores> utilizadorExistente = repository.findById(id);

        if(utilizadorExistente.isPresent()){

            Utilizadores utilizador = utilizadorExistente.get();

            utilizador.setNome(novoUtilizador.getNome());
            utilizador.setEmail(novoUtilizador.getEmail());
            utilizador.setPalavraPasse(novoUtilizador.getPalavraPasse());
            utilizador.setIdPerfil(novoUtilizador.getIdPerfil());
            utilizador.setEstadoConta(novoUtilizador.getEstadoConta());
            utilizador.setUltimoLogin(novoUtilizador.getUltimoLogin());
            utilizador.setCriadoPor(novoUtilizador.getCriadoPor());
            utilizador.setDataAtualizacao(novoUtilizador.getDataAtualizacao());

            return repository.save(utilizador);
        } else {
            throw new RuntimeException("Utilizador não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Erro ao apagar utilizador");
        }
    }
}
