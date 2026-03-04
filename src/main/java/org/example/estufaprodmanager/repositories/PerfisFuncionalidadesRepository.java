package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.PerfisFuncionalidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PerfisFuncionalidadesRepository extends JpaRepository<PerfisFuncionalidades, String>, JpaSpecificationExecutor<PerfisFuncionalidades> {

}