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
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "id_utilizador", nullable = false)
    private String idUtilizador;

    @Column(name = "horario_trabalho")
    private String horarioTrabalho;

    @Column(name = "nif", nullable = false)
    private String nif;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "morada")
    private String morada;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "foto_colaborador")
    private String fotoColaborador;

    @Column(name = "data_ingressao")
    private Date dataIngressao;

    @Column(name = "criado_por")
    private String criadoPor;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
