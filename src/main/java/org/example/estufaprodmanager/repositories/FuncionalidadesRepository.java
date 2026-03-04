package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Funcionalidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FuncionalidadesRepository extends JpaRepository<Funcionalidades, String>, JpaSpecificationExecutor<Funcionalidades> {

}