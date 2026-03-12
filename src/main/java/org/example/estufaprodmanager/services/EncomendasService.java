package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Encomendas;
import org.example.estufaprodmanager.repositories.EncomendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EncomendasService {

    @Autowired
    private EncomendasRepository repository;

    // List
    public List<Encomendas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Encomendas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Encomendas save(Encomendas encomenda){
        encomenda.setId(UUID.randomUUID());
        return repository.save(encomenda);
    }

    // Update
    public Encomendas update(UUID id, Encomendas novaEncomenda){

        Optional<Encomendas> encomendaExistente = repository.findById(id);

        if(encomendaExistente.isPresent()){

            Encomendas encomenda = encomendaExistente.get();

            encomenda.setIdCliente(novaEncomenda.getIdCliente());
            encomenda.setValorFinal(novaEncomenda.getValorFinal());
            encomenda.setIvaTotal(novaEncomenda.getIvaTotal());
            encomenda.setDescontoTotal(novaEncomenda.getDescontoTotal());
            encomenda.setEstadoEncomenda(novaEncomenda.getEstadoEncomenda());
            encomenda.setDataAtualizacao(novaEncomenda.getDataAtualizacao());

            return repository.save(encomenda);

        } else {
            throw new RuntimeException("Encomenda não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Encomenda não encontrada");
        }
    }
}