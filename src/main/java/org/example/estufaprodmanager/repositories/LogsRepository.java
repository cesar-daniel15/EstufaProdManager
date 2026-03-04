package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LogsRepository extends JpaRepository<Logs, String>, JpaSpecificationExecutor<Logs> {

}