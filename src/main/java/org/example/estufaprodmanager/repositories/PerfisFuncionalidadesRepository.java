package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.PerfisFuncionalidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface PerfisFuncionalidadesRepository extends JpaRepository<PerfisFuncionalidades, UUID>, JpaSpecificationExecutor<PerfisFuncionalidades> {

}