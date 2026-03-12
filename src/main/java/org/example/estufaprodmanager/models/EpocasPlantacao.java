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
@Table(name = "epocas_plantacao")
public class EpocasPlantacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "ano", nullable = false)
    private String ano;

    @Column(name = "estacao", nullable = false)
    private String estacao;

    @Column(name = "inicio_plantacao", nullable = false)
    private Date inicioPlantacao;

    @Column(name = "fim_plantacao", nullable = false)
    private Date fimPlantacao;

    @Column(name = "inicio_colheita", nullable = false)
    private Date inicioColheita;

    @Column(name = "fim_colheita", nullable = false)
    private Date fimColheita;

    @Column(name = "criado_por")
    private String criadoPor;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
