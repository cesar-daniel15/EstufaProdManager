package org.example.estufaprodmanager.services;

import org.example.estufaprodmanager.models.Produtos;
import org.example.estufaprodmanager.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository repository;

    // List
    public List<Produtos> getAll(){
        return repository.findAll();
    }

    // List by UUID
    public Optional<Produtos> getById(UUID id){
        return repository.findById(id);
    }

    // Create
    public Produtos create(Produtos produto){
        return repository.save(produto);
    }

    // Update
    public Produtos update(UUID id, Produtos novoProduto){

        Optional<Produtos> produtoExistente = repository.findById(id);

        if(produtoExistente.isPresent()){

            Produtos produto = produtoExistente.get();

            produto.setNome(novoProduto.getNome());
            produto.setVariedade(novoProduto.getVariedade());
            produto.setDescricao(novoProduto.getDescricao());
            produto.setPreco(novoProduto.getPreco());
            produto.setDesconto(novoProduto.getDesconto());
            produto.setIva(novoProduto.getIva());
            produto.setQuantidadeDisponivel(novoProduto.getQuantidadeDisponivel());
            produto.setUnidadeMedida(novoProduto.getUnidadeMedida());
            produto.setValidade(novoProduto.getValidade());
            produto.setImagem(novoProduto.getImagem());
            produto.setDataEmbalamento(novoProduto.getDataEmbalamento());
            produto.setEstadoProduto(novoProduto.getEstadoProduto());

            return repository.save(produto);

        } else {
            throw new RuntimeException("Produto não encontrado com o ID: " + id);
        }
    }

    // Delete
    public void delete(UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }
}