package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.ColheitaColaborador;
import org.example.estufaprodmanager.repositories.ColheitaColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ColheitaColaboradorService {

    @Autowired
    private ColheitaColaboradorRepository repository;

    // List
    public List<ColheitaColaborador> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<ColheitaColaborador> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public ColheitaColaborador create(ColheitaColaborador colheitaColaborador){
        colheitaColaborador.setId(UUID.randomUUID());
        return repository.save(colheitaColaborador);
    }

    // Update
    public ColheitaColaborador update(UUID id, ColheitaColaborador novaRelacao){

        Optional<ColheitaColaborador> relacaoExistente = repository.findById(id);

        if(relacaoExistente.isPresent()){

            ColheitaColaborador relacao = relacaoExistente.get();

            relacao.setIdColheita(novaRelacao.getIdColheita());
            relacao.setIdColaborador(novaRelacao.getIdColaborador());
            relacao.setFuncao(novaRelacao.getFuncao());

            return repository.save(relacao);

        } else {
            throw new RuntimeException("Relação Colheita-Colaborador não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Relação Colheita-Colaborador não encontrada");
        }
    }
}