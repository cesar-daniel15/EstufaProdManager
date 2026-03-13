package org.example.estufaprodmanager.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.estufaprodmanager.enums.EstadoPlantacao;
import org.example.estufaprodmanager.enums.TipoProducao;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "plantacoes")
public class Plantacoes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "id_epoca_plantacao", nullable = false)
    private String idEpocaPlantacao;

    @Column(name = "id_estufa", nullable = false)
    private String idEstufa;

    @Column(name = "id_canteiro", nullable = false)
    private String idCanteiro;

    @Column(name = "id_horticolas", nullable = false)
    private String idHorticolas;

    @Column(name = "id_variedade", nullable = false)
    private String idVariedade;

    @Column(name = "data_plantacao", nullable = false)
    private Date dataPlantacao;

    @Column(name = "data_prevista_colheita")
    private Date dataPrevistaColheita;

    @Column(name = "quantidade_plantada", nullable = false)
    private Long quantidadePlantada;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_producao", nullable = false)
    private TipoProducao tipoProducao;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_plantacao", nullable = false)
    private EstadoPlantacao estadoPlantacao;

    @Column(name = "criado_por")
    private String criadoPor;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

}
