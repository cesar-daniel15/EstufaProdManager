package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.InspecoesQualidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface InspecoesQualidadeRepository extends JpaRepository<InspecoesQualidade, UUID>, JpaSpecificationExecutor<InspecoesQualidade> {

}