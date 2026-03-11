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
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "inspecoes_qualidade")
public class InspecoesQualidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "id_colheita", nullable = false)
    private String idColheita;

    @Column(name = "inspecionado_por")
    private String inspecionadoPor;

    @Column(name = "quantidade_aprovada")
    private BigDecimal quantidadeAprovada;

    @Column(name = "quantidade_rejeitada")
    private BigDecimal quantidadeRejeitada;

    @Column(name = "resultado_qualidade")
    private String resultadoQualidade;

    @Column(name = "anexos")
    private String anexos;

    @Column(name = "estado_inspecao")
    private String estadoInspecao;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
