package org.example.estufaprodmanager;

import org.example.estufaprodmanager.enums.CategoriaHorticola;
import org.example.estufaprodmanager.enums.EstadoConta;
import org.example.estufaprodmanager.models.Horticolas;
import org.example.estufaprodmanager.models.Perfis;
import org.example.estufaprodmanager.models.Utilizadores;
import org.example.estufaprodmanager.models.VariedadesHorticolas;
import org.example.estufaprodmanager.repositories.HorticolasRepository;
import org.example.estufaprodmanager.repositories.PerfisRepository;
import org.example.estufaprodmanager.services.HorticolasService;
import org.example.estufaprodmanager.services.UtilizadoresService;
import org.example.estufaprodmanager.services.VariedadesHorticolasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;


@SpringBootApplication
public class EstufaProdManagerApplication implements CommandLineRunner {

    @Autowired
    private UtilizadoresService utilizadoresService;

    @Autowired
    private PerfisRepository perfisRepository;

    @Autowired
    private HorticolasService horticolasService;

    @Autowired
    private VariedadesHorticolasService variedadesHorticolasService;
    @Autowired
    private HorticolasRepository horticolasRepository;

    public static void main(String[] args) {
        SpringApplication.run(EstufaProdManagerApplication.class, args);

    }

    @Override
    public void run(String... args) {

        try {
            Perfis perfilCliente = perfisRepository.findByNome("Administrador");

            Utilizadores utilizador = new Utilizadores();
            utilizador.setNome("Utilizador de Testes");
            utilizador.setEmail("utilizador@gmail.com");
            utilizador.setPalavraPasse("password");
            utilizador.setIdPerfil(perfilCliente.getId());
            utilizador.setEstadoConta(EstadoConta.Ativa);

            utilizadoresService.create(utilizador);

            Horticolas horticolas = new Horticolas();
            horticolas.setNome("Alface");
            horticolas.setDescricao("Hortícola folhosa usada em saladas");
            horticolas.setCategoria(CategoriaHorticola.Folha);

            Horticolas horticolaCriada = horticolasService.create(horticolas);

            VariedadesHorticolas variedadesHorticolas = new VariedadesHorticolas();

            variedadesHorticolas.setIdHorticola(horticolaCriada.getId());
            variedadesHorticolas.setNome("Alface Romana");
            variedadesHorticolas.setSementesDisponiveis(10L);
            variedadesHorticolas.setEpocaColheita("Primavera");
            variedadesHorticolas.setEpocaPlantacao("Inverno");
            variedadesHorticolas.setTempoMedioCrescimento("45");
            variedadesHorticolas.setImagem(" ");

            System.out.println("Todos os dados foram criados com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
