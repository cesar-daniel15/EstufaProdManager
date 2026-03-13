package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.EstadoProduto;
import org.example.estufaprodmanager.enums.UnidadeMedida;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "produtos")
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "variedade")
    private String variedade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "desconto")
    private BigDecimal desconto;

    @Column(name = "iva", nullable = false)
    private BigDecimal iva;

    @Column(name = "quantidade_disponivel", nullable = false)
    private Long quantidadeDisponivel;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidade_medida", nullable = false)
    private UnidadeMedida unidadeMedida;

    @Column(name = "validade")
    private Date validade;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "data_embalamento", nullable = false)
    private Date dataEmbalamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_produto", nullable = false)
    private EstadoProduto estadoProduto;

}
