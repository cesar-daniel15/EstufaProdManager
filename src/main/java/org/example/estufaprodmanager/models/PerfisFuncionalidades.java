package org.example.estufaprodmanager.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@JsonPropertyOrder({ "id", "id_perfil", "id_funcionalidade"})
@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "perfis_funcionalidades")
public class PerfisFuncionalidades implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_perfil", nullable = false)
    private UUID idPerfil;

    @Column(name = "id_funcionalidade", nullable = false)
    private UUID idFuncionalidade;

}
