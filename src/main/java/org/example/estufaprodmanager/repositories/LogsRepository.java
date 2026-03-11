package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface LogsRepository extends JpaRepository<Logs, UUID>, JpaSpecificationExecutor<Logs> {
    // Já vem feito
    // Save
    // findAll ()
    // findById ()
    // deleteByIr()

}