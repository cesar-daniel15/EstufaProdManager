package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Encomendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface EncomendasRepository extends JpaRepository<Encomendas, UUID>, JpaSpecificationExecutor<Encomendas> {

}