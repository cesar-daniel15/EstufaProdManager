package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Logs;
import org.example.estufaprodmanager.repositories.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LogsService {

    @Autowired
    private LogsRepository repository;

    // List
    public List<Logs> getAll(){
        return repository.findAll();
    }

    // List by Id
    public Logs getById (UUID id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Log não encontrado"));
    }


    // Create
    public Logs create(Logs entity){
        entity.setId(UUID.randomUUID());
        return repository.save(entity);
    }


    // Update
    public Logs update (UUID id, Logs novaLog){
        Logs log = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Log não encontrada"));

        log.setDescricao(novaLog.getDescricao());
        log.setAcao(novaLog.getAcao());
        log.setEcraOrigem(novaLog.getEcraOrigem());
        log.setIpOrigem(novaLog.getIpOrigem());
        log.setUserAgent(novaLog.getUserAgent());

        return repository.save(log);
    }


    // Delete
    public void delete(UUID id){
        repository.deleteById(id);
    }
}
