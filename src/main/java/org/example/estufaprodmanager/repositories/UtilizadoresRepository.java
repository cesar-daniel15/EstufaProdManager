package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Utilizadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UtilizadoresRepository extends JpaRepository<Utilizadores, String>, JpaSpecificationExecutor<Utilizadores> {

}