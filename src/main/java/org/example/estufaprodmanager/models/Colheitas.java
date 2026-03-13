package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.EstadoColheita;
import org.example.estufaprodmanager.enums.TipoEmbalamento;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_plantacao", nullable = false)
    private UUID idPlantacao;

    @Column(name = "inicio_colheita", nullable = false)
    private Date inicioColheita;

    @Column(name = "fim_colheita")
    private Date fimColheita;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_embalamento", nullable = false)
    private TipoEmbalamento tipoEmbalamento;

    @Column(name = "peso_total")
    private BigDecimal pesoTotal;

    @Column(name = "quantidade_embalagens", nullable = false)
    private Long quantidadeEmbalagens;

    @Column(name = "percentagem_aproveitamento")
    private BigDecimal percentagemAproveitamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_colheita", nullable = false)
    private EstadoColheita estadoColheita;

}
