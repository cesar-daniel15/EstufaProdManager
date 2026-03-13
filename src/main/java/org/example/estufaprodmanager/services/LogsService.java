package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.repositories.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LogsService {

    @Autowired
    private LogsRepository repository;

    // List
    public List<Logs> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Logs> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Logs create(Logs log){
        return repository.save(log);
    }

    // Update
    public Logs update(UUID id, Logs novaLog){

        Optional<Logs> logExistente = repository.findById(id);

        if(logExistente.isPresent()){

            Logs log = logExistente.get();

            log.setDescricao(novaLog.getDescricao());
            log.setAcao(novaLog.getAcao());
            log.setEcraOrigem(novaLog.getEcraOrigem());
            log.setIpOrigem(novaLog.getIpOrigem());
            log.setUserAgent(novaLog.getUserAgent());

            return repository.save(log);

        } else {
            throw new RuntimeException("Log não encontrado com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Log não encontrado");
        }
    }
}