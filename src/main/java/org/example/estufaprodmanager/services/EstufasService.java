package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Estufas;
import org.example.estufaprodmanager.repositories.EstufasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EstufasService {

    @Autowired
    private EstufasRepository repository;

    // List
    public List<Estufas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Estufas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Estufas create(Estufas estufa){
        estufa.setId(UUID.randomUUID());
        return repository.save(estufa);
    }

    // Update
    public Estufas update(UUID id, Estufas novaEstufa){

        Optional<Estufas> estufaExistente = repository.findById(id);

        if(estufaExistente.isPresent()){

            Estufas estufa = estufaExistente.get();

            estufa.setIdentificacao(novaEstufa.getIdentificacao());
            estufa.setLocalizacao(novaEstufa.getLocalizacao());
            estufa.setArea(novaEstufa.getArea());
            estufa.setEstadoEstufa(novaEstufa.getEstadoEstufa());
            estufa.setCriadoPor(novaEstufa.getCriadoPor());

            return repository.save(estufa);

        } else {
            throw new RuntimeException("Estufa não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Estufa não encontrada");
        }
    }
}