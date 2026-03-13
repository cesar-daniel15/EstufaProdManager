package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.EstadoEncomenda;
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
@Table(name = "encomendas")
public class Encomendas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_cliente", nullable = false)
    private String idCliente;

    @Column(name = "valor_final", nullable = false)
    private BigDecimal valorFinal;

    @Column(name = "iva_total", nullable = false)
    private BigDecimal ivaTotal;

    @Column(name = "desconto_total", nullable = false)
    private BigDecimal descontoTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_encomenda", nullable = false)
    private EstadoEncomenda estadoEncomenda;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
