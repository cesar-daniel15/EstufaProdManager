package org.example.estufaprodmanager.repositories;

import org.example.estufaprodmanager.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface ClientesRepository extends JpaRepository<Clientes, UUID>, JpaSpecificationExecutor<Clientes> {

}