package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Estufas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstufasRepository extends JpaRepository<Estufas, String>, JpaSpecificationExecutor<Estufas> {

}