package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.EpocasPlantacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface EpocasPlantacaoRepository extends JpaRepository<EpocasPlantacao, UUID>, JpaSpecificationExecutor<EpocasPlantacao> {

}