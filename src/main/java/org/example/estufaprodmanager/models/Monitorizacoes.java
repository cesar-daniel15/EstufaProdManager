package org.example.estufaprodmanager.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "monitorizacoes")
public class Monitorizacoes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "anexos")
    private String anexos;

    @Column(name = "id_colaborador", nullable = false)
    private String idColaborador;

    @Column(name = "id_plantacao", nullable = false)
    private String idPlantacao;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

}
