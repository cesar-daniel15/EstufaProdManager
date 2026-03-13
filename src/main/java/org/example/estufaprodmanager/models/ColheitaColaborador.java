package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.FuncaoColheita;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "colheita_colaborador")
public class ColheitaColaborador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_colheita", nullable = false)
    private String idColheita;

    @Column(name = "id_colaborador", nullable = false)
    private String idColaborador;

    @Enumerated(EnumType.STRING)
    @Column(name = "funcao", nullable = false)
    private FuncaoColheita funcao;

}
