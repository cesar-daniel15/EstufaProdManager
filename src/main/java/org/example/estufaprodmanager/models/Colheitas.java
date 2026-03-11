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
import java.sql.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "colheitas")
public class Colheitas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_plantacao", nullable = false)
    private String idPlantacao;

    @Column(name = "inicio_colheita", nullable = false)
    private Date inicioColheita;

    @Column(name = "fim_colheita")
    private Date fimColheita;

    @Column(name = "tipo_embalamento", nullable = false)
    private String tipoEmbalamento;

    @Column(name = "peso_total")
    private BigDecimal pesoTotal;

    @Column(name = "quantidade_embalagens", nullable = false)
    private Long quantidadeEmbalagens;

    @Column(name = "percentagem_aproveitamento")
    private BigDecimal percentagemAproveitamento;

    @Column(name = "estado_colheita", nullable = false)
    private String estadoColheita;

}
