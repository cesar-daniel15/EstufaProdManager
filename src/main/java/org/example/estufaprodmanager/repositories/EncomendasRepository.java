package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Encomendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EncomendasRepository extends JpaRepository<Encomendas, String>, JpaSpecificationExecutor<Encomendas> {

}