package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Estufas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface EstufasRepository extends JpaRepository<Estufas, UUID>, JpaSpecificationExecutor<Estufas> {

}