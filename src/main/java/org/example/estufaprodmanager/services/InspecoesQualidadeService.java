package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.InspecoesQualidade;
import org.example.estufaprodmanager.repositories.InspecoesQualidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InspecoesQualidadeService {

    @Autowired
    private InspecoesQualidadeRepository repository;

    // List
    public List<InspecoesQualidade> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<InspecoesQualidade> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public InspecoesQualidade create(InspecoesQualidade inspecao){
        return repository.save(inspecao);
    }

    // Update
    public InspecoesQualidade update(UUID id, InspecoesQualidade novaInspecao){

        Optional<InspecoesQualidade> inspecaoExistente = repository.findById(id);

        if(inspecaoExistente.isPresent()){

            InspecoesQualidade inspecao = inspecaoExistente.get();

            inspecao.setIdColheita(novaInspecao.getIdColheita());
            inspecao.setInspecionadoPor(novaInspecao.getInspecionadoPor());
            inspecao.setQuantidadeAprovada(novaInspecao.getQuantidadeAprovada());
            inspecao.setQuantidadeRejeitada(novaInspecao.getQuantidadeRejeitada());
            inspecao.setResultadoQualidade(novaInspecao.getResultadoQualidade());
            inspecao.setAnexos(novaInspecao.getAnexos());
            inspecao.setEstadoInspecao(novaInspecao.getEstadoInspecao());
            inspecao.setDataAtualizacao(novaInspecao.getDataAtualizacao());

            return repository.save(inspecao);

        } else {
            throw new RuntimeException("Inspeção não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Inspeção não encontrada");
        }
    }
}