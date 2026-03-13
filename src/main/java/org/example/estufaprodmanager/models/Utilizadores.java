package org.example.estufaprodmanager.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.EstadoConta;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@JsonPropertyOrder({ "id", "nome", "email", "palavra_passe", "id_perfil", "estado_conta", "ultimo_login", "criado_por", "data_criacao", "data_atualizacao"})
@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "utilizadores")
public class Utilizadores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "palavra_passe", nullable = false)
    private String palavraPasse;

    @Column(name = "id_perfil", nullable = false)
    private String idPerfil;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_conta", nullable = false)
    private EstadoConta estadoConta;

    @Column(name = "ultimo_login")
    private Date ultimoLogin;

    @Column(name = "criado_por")
    private String criadoPor;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
