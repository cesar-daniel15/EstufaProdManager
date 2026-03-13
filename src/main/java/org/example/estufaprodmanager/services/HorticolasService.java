package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Horticolas;
import org.example.estufaprodmanager.repositories.HorticolasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HorticolasService {

    @Autowired
    private HorticolasRepository repository;

    // List
    public List<Horticolas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Horticolas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Horticolas create(Horticolas horticola){

        if (repository.existsByNome(horticola.getNome())) {
            throw new RuntimeException("Já existe essa horticola");
        }

        return repository.save(horticola);
    }

    // Update
    public Horticolas update(UUID id, Horticolas novaHorticola){

        Optional<Horticolas> horticolaExistente = repository.findById(id);

        if(horticolaExistente.isPresent()){

            Horticolas horticola = horticolaExistente.get();

            horticola.setNome(novaHorticola.getNome());
            horticola.setDescricao(novaHorticola.getDescricao());
            horticola.setCategoria(novaHorticola.getCategoria());
            horticola.setCriadoPor(novaHorticola.getCriadoPor());
            horticola.setDataAtualizacao(novaHorticola.getDataAtualizacao());

            return repository.save(horticola);

        } else {
            throw new RuntimeException("Hortícola não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Hortícola não encontrada");
        }
    }
}