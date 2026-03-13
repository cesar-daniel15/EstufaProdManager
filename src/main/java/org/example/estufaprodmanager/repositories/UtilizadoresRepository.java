package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Utilizadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface UtilizadoresRepository extends JpaRepository<Utilizadores, UUID>, JpaSpecificationExecutor<Utilizadores> {
    boolean existsByEmail(String email);
}