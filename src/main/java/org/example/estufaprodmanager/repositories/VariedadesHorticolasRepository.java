package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.VariedadesHorticolas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface VariedadesHorticolasRepository extends JpaRepository<VariedadesHorticolas, UUID>, JpaSpecificationExecutor<VariedadesHorticolas> {

}