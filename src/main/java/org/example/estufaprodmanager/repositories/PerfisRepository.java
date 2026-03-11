package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Perfis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PerfisRepository extends JpaRepository<Perfis, String>, JpaSpecificationExecutor<Perfis> {

}