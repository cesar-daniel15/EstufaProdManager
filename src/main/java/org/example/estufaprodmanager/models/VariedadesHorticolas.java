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
@Table(name = "variedades_horticolas")
public class VariedadesHorticolas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "id_horticola", nullable = false)
    private String idHorticola;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sementes_disponiveis", nullable = false)
    private Long sementesDisponiveis;

    @Column(name = "epoca_colheita", nullable = false)
    private String epocaColheita;

    @Column(name = "epoca_plantacao", nullable = false)
    private String epocaPlantacao;

    @Column(name = "tempo_medio_crescimento", nullable = false)
    private String tempoMedioCrescimento;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "criado_por")
    private String criadoPor;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
