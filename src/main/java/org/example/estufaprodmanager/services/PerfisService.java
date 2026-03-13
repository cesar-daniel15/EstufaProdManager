package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Perfis;
import org.example.estufaprodmanager.repositories.PerfisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PerfisService {

     @Autowired
    private PerfisRepository repository;

     // List
     public List<Perfis> getAll(){
         return repository.findAll();
     }

    // List by UUID
    public Optional<Perfis> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Perfis create(Perfis perfil){
        return repository.save(perfil);
    }

    // Update
    public Perfis update(UUID id, Perfis novoPerfil){
        Optional<Perfis> perfilExiste = repository.findById(id);

        if(perfilExiste.isPresent()){

            Perfis perfil = perfilExiste.get();

            perfil.setNome(novoPerfil.getNome());
            perfil.setDescricao(novoPerfil.getDescricao());

            return repository.save(perfil);
        } else {
            throw new RuntimeException("Perfil não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Erro ao apagar perfil");
        }
    }
}
