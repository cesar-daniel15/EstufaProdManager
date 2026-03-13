package org.example.estufaprodmanager.seeders;

import org.example.estufaprodmanager.models.Perfis;
import org.example.estufaprodmanager.repositories.PerfisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PerfisSeeder implements CommandLineRunner {

    @Autowired
    private PerfisRepository repository;

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {

            repository.save(Perfis.builder()
                    .nome("Administrador")
                    .descricao("Responsável pela gestão técnica e segurança da plataforma, de modo a garantir que os utilizadores e os seus níveis de acesso estão configurados corretamente")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Produtor")
                    .descricao("Representa o gestor executivo, tendo uma visão transversal que vai desde a infraestrutura até ao sucesso das vendas")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Chefe de produção")
                    .descricao("Coordena as atividades no terreno de modo a assegurar que o plano de produção é cumprido")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Empregado")
                    .descricao("É estritamente operacional, focado na execução das tarefas que lhe são propostas")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Departamento de qualidade")
                    .descricao("Atua como filtro de controlo entre a produção e o cliente final")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Departamento financeiro")
                    .descricao("Responsável pela gestão de clientes, vendas e logística de saída")
                    .build());

            repository.save(Perfis.builder()
                    .nome("Cliente")
                    .descricao("Utilizador externo que consome os produtos da exploração")
                    .build());
        }
    }
}
