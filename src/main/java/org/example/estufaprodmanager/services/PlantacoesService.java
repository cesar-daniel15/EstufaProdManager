package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Plantacoes;
import org.example.estufaprodmanager.repositories.PlantacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PlantacoesService {

    @Autowired
    private PlantacoesRepository repository;

    // List
    public List<Plantacoes> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Plantacoes> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Plantacoes create(Plantacoes plantacao){
        return repository.save(plantacao);
    }

    // Update
    public Plantacoes update(UUID id, Plantacoes novaPlantacao){

        Optional<Plantacoes> plantacaoExistente = repository.findById(id);

        if(plantacaoExistente.isPresent()){

            Plantacoes plantacao = plantacaoExistente.get();

            plantacao.setIdEpocaPlantacao(novaPlantacao.getIdEpocaPlantacao());
            plantacao.setIdEstufa(novaPlantacao.getIdEstufa());
            plantacao.setIdCanteiro(novaPlantacao.getIdCanteiro());
            plantacao.setIdHorticolas(novaPlantacao.getIdHorticolas());
            plantacao.setIdVariedade(novaPlantacao.getIdVariedade());
            plantacao.setDataPlantacao(novaPlantacao.getDataPlantacao());
            plantacao.setDataPrevistaColheita(novaPlantacao.getDataPrevistaColheita());
            plantacao.setQuantidadePlantada(novaPlantacao.getQuantidadePlantada());
            plantacao.setTipoProducao(novaPlantacao.getTipoProducao());
            plantacao.setEstadoPlantacao(novaPlantacao.getEstadoPlantacao());
            plantacao.setCriadoPor(novaPlantacao.getCriadoPor());
            plantacao.setDataAtualizacao(novaPlantacao.getDataAtualizacao());

            return repository.save(plantacao);

        } else {
            throw new RuntimeException("Plantação não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Plantação não encontrada");
        }
    }
}