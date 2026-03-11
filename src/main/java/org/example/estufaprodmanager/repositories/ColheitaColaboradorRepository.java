package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.ColheitaColaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface ColheitaColaboradorRepository extends JpaRepository<ColheitaColaborador, UUID>, JpaSpecificationExecutor<ColheitaColaborador> {

}