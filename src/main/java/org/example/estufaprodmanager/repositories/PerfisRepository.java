package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Perfis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface PerfisRepository extends JpaRepository<Perfis, UUID>, JpaSpecificationExecutor<Perfis> {
    Perfis findByNome(String nome);
}