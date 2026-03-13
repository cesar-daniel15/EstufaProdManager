package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.ResultadoQualidade;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_colheita", nullable = false)
    private UUID idColheita;

    @Column(name = "inspecionado_por")
    private UUID inspecionadoPor;

    @Column(name = "quantidade_aprovada")
    private BigDecimal quantidadeAprovada;

    @Column(name = "quantidade_rejeitada")
    private BigDecimal quantidadeRejeitada;

    @Enumerated(EnumType.STRING)
    @Column(name = "resultado_qualidade")
    private ResultadoQualidade resultadoQualidade;

    @Column(name = "anexos")
    private String anexos;

    @Column(name = "estado_inspecao")
    private String estadoInspecao;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
