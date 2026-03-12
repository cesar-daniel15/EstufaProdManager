package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Clientes;
import org.example.estufaprodmanager.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    // List
    public List<Clientes> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Clientes> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Clientes create(Clientes cliente){
        cliente.setId(UUID.randomUUID());
        return repository.save(cliente);
    }

    // Update
    public Clientes update(UUID id, Clientes novoCliente){

        Optional<Clientes> clienteExistente = repository.findById(id);

        if(clienteExistente.isPresent()){

            Clientes cliente = clienteExistente.get();

            cliente.setIdUtilizador(novoCliente.getIdUtilizador());
            cliente.setNif(novoCliente.getNif());
            cliente.setSetorAtividade(novoCliente.getSetorAtividade());
            cliente.setMorada(novoCliente.getMorada());
            cliente.setCodigoPostal(novoCliente.getCodigoPostal());
            cliente.setContacto(novoCliente.getContacto());
            cliente.setCriadoPor(novoCliente.getCriadoPor());
            cliente.setDataAtualizacao(novoCliente.getDataAtualizacao());

            return repository.save(cliente);

        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente não encontrado");
        }
    }
}