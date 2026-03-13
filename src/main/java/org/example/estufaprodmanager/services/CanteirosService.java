package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Canteiros;
import org.example.estufaprodmanager.repositories.CanteirosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CanteirosService {

    @Autowired
    private CanteirosRepository repository;

    // List
    public List<Canteiros> getAll(){
        return repository.findAll();
    }

    // List by Id
    public Optional<Canteiros> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Canteiros create(Canteiros canteiro){
        return repository.save(canteiro);
    }

    // Update
    public Canteiros update(UUID id, Canteiros novoCanteiro){

        Optional<Canteiros> canteiroExistente = repository.findById(id);

        if(canteiroExistente.isPresent()){

            Canteiros canteiro = canteiroExistente.get();

            canteiro.setIdEstufa(novoCanteiro.getIdEstufa());
            canteiro.setIdentificacao(novoCanteiro.getIdentificacao());
            canteiro.setTipoSolo(novoCanteiro.getTipoSolo());
            canteiro.setCriadoPor(novoCanteiro.getCriadoPor());
            canteiro.setDataAtualizacao(novoCanteiro.getDataAtualizacao());

            return repository.save(canteiro);

        } else {
            throw new RuntimeException("Canteiro não encontrado com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Canteiro não encontrado");
        }
    }
}