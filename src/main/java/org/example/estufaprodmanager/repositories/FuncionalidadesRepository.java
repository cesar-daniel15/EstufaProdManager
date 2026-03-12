package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Funcionalidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface FuncionalidadesRepository extends JpaRepository<Funcionalidades, UUID>, JpaSpecificationExecutor<Funcionalidades> {
    // Default Methods
    //    save()
    //    findAll()
    //    findById()
    //    deleteById()
}