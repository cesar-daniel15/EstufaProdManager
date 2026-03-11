package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Plantacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlantacoesRepository extends JpaRepository<Plantacoes, String>, JpaSpecificationExecutor<Plantacoes> {

}