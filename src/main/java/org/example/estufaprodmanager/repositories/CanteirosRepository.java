package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Canteiros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface CanteirosRepository extends JpaRepository<Canteiros, UUID>, JpaSpecificationExecutor<Canteiros> {

}