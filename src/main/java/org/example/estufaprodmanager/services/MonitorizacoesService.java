package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Monitorizacoes;
import org.example.estufaprodmanager.repositories.MonitorizacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MonitorizacoesService {

    @Autowired
    private MonitorizacoesRepository repository;

    // List
    public List<Monitorizacoes> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Monitorizacoes> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Monitorizacoes create(Monitorizacoes monitorizacao){
        monitorizacao.setId(UUID.randomUUID());
        return repository.save(monitorizacao);
    }

    // Update
    public Monitorizacoes update(UUID id, Monitorizacoes novaMonitorizacao){

        Optional<Monitorizacoes> monitorizacaoExistente = repository.findById(id);

        if(monitorizacaoExistente.isPresent()){

            Monitorizacoes monitorizacao = monitorizacaoExistente.get();

            monitorizacao.setTitulo(novaMonitorizacao.getTitulo());
            monitorizacao.setObservacoes(novaMonitorizacao.getObservacoes());
            monitorizacao.setAnexos(novaMonitorizacao.getAnexos());
            monitorizacao.setIdColaborador(novaMonitorizacao.getIdColaborador());
            monitorizacao.setIdPlantacao(novaMonitorizacao.getIdPlantacao());

            return repository.save(monitorizacao);

        } else {
            throw new RuntimeException("Monitorização não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Monitorização não encontrada");
        }
    }
}