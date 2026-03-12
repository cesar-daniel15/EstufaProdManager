package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Colaboradores;
import org.example.estufaprodmanager.repositories.ColaboradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ColaboradoresService {

    @Autowired
    private ColaboradoresRepository repository;

    // List
    public List<Colaboradores> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Colaboradores> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Colaboradores create(Colaboradores colaborador){
        colaborador.setId(UUID.randomUUID());
        return repository.save(colaborador);
    }

    // Update
    public Colaboradores update(UUID id, Colaboradores novoColaborador){

        Optional<Colaboradores> colaboradorExistente = repository.findById(id);

        if(colaboradorExistente.isPresent()){

            Colaboradores colaborador = colaboradorExistente.get();

            colaborador.setIdUtilizador(novoColaborador.getIdUtilizador());
            colaborador.setHorarioTrabalho(novoColaborador.getHorarioTrabalho());
            colaborador.setNif(novoColaborador.getNif());
            colaborador.setEstadoCivil(novoColaborador.getEstadoCivil());
            colaborador.setMorada(novoColaborador.getMorada());
            colaborador.setCodigoPostal(novoColaborador.getCodigoPostal());
            colaborador.setContacto(novoColaborador.getContacto());
            colaborador.setFotoColaborador(novoColaborador.getFotoColaborador());
            colaborador.setDataIngressao(novoColaborador.getDataIngressao());
            colaborador.setCriadoPor(novoColaborador.getCriadoPor());
            colaborador.setDataAtualizacao(novoColaborador.getDataAtualizacao());

            return repository.save(colaborador);

        } else {
            throw new RuntimeException("Colaborador não encontrado com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Colaborador não encontrado");
        }
    }
}