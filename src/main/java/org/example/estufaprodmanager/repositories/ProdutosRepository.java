package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface ProdutosRepository extends JpaRepository<Produtos, UUID>, JpaSpecificationExecutor<Produtos> {

}