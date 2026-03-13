package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "logs")
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "acao", nullable = false)
    private String acao;

    @Column(name = "id_utilizador", nullable = false)
    private String idUtilizador;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "ecra_origem", nullable = false)
    private String ecraOrigem;

    @Column(name = "ip_origem", nullable = false)
    private String ipOrigem;

    @Column(name = "user_agent", nullable = false)
    private String userAgent;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

}
