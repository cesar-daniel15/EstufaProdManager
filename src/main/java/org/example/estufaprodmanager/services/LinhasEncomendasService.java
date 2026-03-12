package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.LinhasEncomendas;
import org.example.estufaprodmanager.repositories.LinhasEncomendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LinhasEncomendasService {

    @Autowired
    private LinhasEncomendasRepository repository;

    // List
    public List<LinhasEncomendas> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<LinhasEncomendas> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public LinhasEncomendas create(LinhasEncomendas linha){
        linha.setId(UUID.randomUUID());
        return repository.save(linha);
    }

    // Update
    public LinhasEncomendas update(UUID id, LinhasEncomendas novaLinha){

        Optional<LinhasEncomendas> linhaExistente = repository.findById(id);

        if(linhaExistente.isPresent()){

            LinhasEncomendas linha = linhaExistente.get();

            linha.setIdEncomenda(novaLinha.getIdEncomenda());
            linha.setIdProduto(novaLinha.getIdProduto());
            linha.setQuantidade(novaLinha.getQuantidade());
            linha.setPrecoUnitario(novaLinha.getPrecoUnitario());
            linha.setTotalLinha(novaLinha.getTotalLinha());
            linha.setDataAtualizacao(novaLinha.getDataAtualizacao());

            return repository.save(linha);

        } else {
            throw new RuntimeException("Linha de encomenda não encontrada com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Linha de encomenda não encontrada");
        }
    }
}