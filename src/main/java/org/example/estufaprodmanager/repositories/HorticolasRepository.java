package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Horticolas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface HorticolasRepository extends JpaRepository<Horticolas, UUID>, JpaSpecificationExecutor<Horticolas> {

}