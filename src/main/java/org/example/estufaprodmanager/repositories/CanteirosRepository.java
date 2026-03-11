package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Canteiros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CanteirosRepository extends JpaRepository<Canteiros, String>, JpaSpecificationExecutor<Canteiros> {

}