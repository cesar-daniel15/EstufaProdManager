package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.VariedadesHorticolas;
import org.example.estufaprodmanager.repositories.VariedadesHorticolasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VariedadesHorticolasService {

    @Autowired
    private VariedadesHorticolasRepository repository;

    // List
    public List<VariedadesHorticolas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<VariedadesHorticolas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public VariedadesHorticolas create(VariedadesHorticolas variedade){

        if (repository.existsByNome(variedade.getNome())) {
            throw new RuntimeException("Já existe essa variedade");
        }

        return repository.save(variedade);
    }
    
    // Update
    public VariedadesHorticolas update(UUID id, VariedadesHorticolas novaVariedade){

        Optional<VariedadesHorticolas> variedadeExistente = repository.findById(id);

        if(variedadeExistente.isPresent()){

            VariedadesHorticolas variedade = variedadeExistente.get();

            variedade.setIdHorticola(novaVariedade.getIdHorticola());
            variedade.setNome(novaVariedade.getNome());
            variedade.setSementesDisponiveis(novaVariedade.getSementesDisponiveis());
            variedade.setEpocaColheita(novaVariedade.getEpocaColheita());
            variedade.setEpocaPlantacao(novaVariedade.getEpocaPlantacao());
            variedade.setTempoMedioCrescimento(novaVariedade.getTempoMedioCrescimento());
            variedade.setImagem(novaVariedade.getImagem());
            variedade.setCriadoPor(novaVariedade.getCriadoPor());
            variedade.setDataAtualizacao(novaVariedade.getDataAtualizacao());

            return repository.save(variedade);

        } else {
            throw new RuntimeException("Variedade hortícola não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Variedade hortícola não encontrada");
        }
    }
}
