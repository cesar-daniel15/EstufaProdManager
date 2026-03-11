package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Colheitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ColheitasRepository extends JpaRepository<Colheitas, String>, JpaSpecificationExecutor<Colheitas> {

}