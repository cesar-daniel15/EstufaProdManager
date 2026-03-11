package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Colheitas;
import org.example.estufaprodmanager.repositories.ColheitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ColheitasService {

    @Autowired
    private ColheitasRepository repository;

    // List
    public List<Colheitas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Colheitas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Colheitas create(Colheitas colheita){
        colheita.setId(UUID.randomUUID());
        return repository.save(colheita);
    }

    // Update
    public Colheitas update(UUID id, Colheitas novaColheita){

        Optional<Colheitas> colheitaExistente = repository.findById(id);

        if(colheitaExistente.isPresent()){

            Colheitas colheita = colheitaExistente.get();

            colheita.setIdPlantacao(novaColheita.getIdPlantacao());
            colheita.setInicioColheita(novaColheita.getInicioColheita());
            colheita.setFimColheita(novaColheita.getFimColheita());
            colheita.setTipoEmbalamento(novaColheita.getTipoEmbalamento());
            colheita.setPesoTotal(novaColheita.getPesoTotal());
            colheita.setQuantidadeEmbalagens(novaColheita.getQuantidadeEmbalagens());
            colheita.setPercentagemAproveitamento(novaColheita.getPercentagemAproveitamento());
            colheita.setEstadoColheita(novaColheita.getEstadoColheita());

            return repository.save(colheita);

        } else {
            throw new RuntimeException("Colheita não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Colheita não encontrada");
        }
    }
}