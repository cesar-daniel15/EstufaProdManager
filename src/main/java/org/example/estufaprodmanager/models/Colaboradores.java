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
@Table(name = "colaboradores")
public class Colaboradores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_utilizador", nullable = false)
    private String idUtilizador;

    @Column(name = "horario_trabalho")
    private String horarioTrabalho;


    @Column(name = "nif", nullable = false)
    private String nif;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "morada", nullable = false)
    private String morada;

    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;

    @Column(name = "contacto", nullable = false)
    private String contacto;

    @Column(name = "foto_colaborador")
    private String fotoColaborador;

    @Column(name = "data_ingressao")
    private Date dataIngressao;

    @Column(name = "criado_por")
    private String criadoPor;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
