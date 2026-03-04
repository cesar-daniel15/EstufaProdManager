package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Colaboradores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ColaboradoresRepository extends JpaRepository<Colaboradores, String>, JpaSpecificationExecutor<Colaboradores> {

}