package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Monitorizacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface MonitorizacoesRepository extends JpaRepository<Monitorizacoes, UUID>, JpaSpecificationExecutor<Monitorizacoes> {

}