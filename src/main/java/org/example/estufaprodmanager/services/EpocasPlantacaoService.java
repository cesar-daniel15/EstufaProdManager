package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.EpocasPlantacao;
import org.example.estufaprodmanager.repositories.EpocasPlantacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EpocasPlantacaoService {

    @Autowired
    private EpocasPlantacaoRepository repository;

    // List
    public List<EpocasPlantacao> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<EpocasPlantacao> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public EpocasPlantacao create(EpocasPlantacao epoca){
        return repository.save(epoca);
    }

    // Update
    public EpocasPlantacao update(UUID id, EpocasPlantacao novaEpoca){

        Optional<EpocasPlantacao> epocaExistente = repository.findById(id);

        if(epocaExistente.isPresent()){

            EpocasPlantacao epoca = epocaExistente.get();

            epoca.setAno(novaEpoca.getAno());
            epoca.setEstacao(novaEpoca.getEstacao());
            epoca.setInicioPlantacao(novaEpoca.getInicioPlantacao());
            epoca.setFimPlantacao(novaEpoca.getFimPlantacao());
            epoca.setInicioColheita(novaEpoca.getInicioColheita());
            epoca.setFimColheita(novaEpoca.getFimColheita());
            epoca.setCriadoPor(novaEpoca.getCriadoPor());
            epoca.setDataAtualizacao(novaEpoca.getDataAtualizacao());

            return repository.save(epoca);

        } else {
            throw new RuntimeException("Época de plantação não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Época de plantação não encontrada");
        }
    }
}