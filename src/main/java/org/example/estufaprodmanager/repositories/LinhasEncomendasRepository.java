package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.LinhasEncomendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LinhasEncomendasRepository extends JpaRepository<LinhasEncomendas, String>, JpaSpecificationExecutor<LinhasEncomendas> {

}