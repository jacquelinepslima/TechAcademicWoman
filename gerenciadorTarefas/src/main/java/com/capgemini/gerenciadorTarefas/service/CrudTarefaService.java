package com.capgemini.gerenciadorTarefas.service;

import com.capgemini.gerenciadorTarefas.model.Colaborador;
import com.capgemini.gerenciadorTarefas.model.Tarefa;
import org.springframework.stereotype.Service;
import com.capgemini.gerenciadorTarefas.repository.ColaboradorRepository;
import com.capgemini.gerenciadorTarefas.repository.TarefaRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudTarefaService {

        private final TarefaRepository tarefaRepository;
        private final ColaboradorRepository colaboradorRepository;
        private Boolean system = true;

        private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        public CrudTarefaService(ColaboradorRepository colaboradorRepository, TarefaRepository tarefaRepository) {
            this.tarefaRepository = tarefaRepository;
            this.colaboradorRepository = colaboradorRepository;
        }

        public void inicial(Scanner scan) {

            while (system) {
                System.out.println("Qual ação de TAREFA deseja executar");
                System.out.println("0-SAIR");
                System.out.println("1-CADASTRAR");
                System.out.println("2-ALTERAR");
                System.out.println("3-DELETAR");
                System.out.println("4-PESQUISAR");
                System.out.println("5-PESQUISAR TODOS");


                int action = scan.nextInt();

                switch (action) {
                    case 1:
                        salvar(scan);
                        break;
                    case 2:
                        atualizar(scan);
                        break;
                    case 3:
                        deletar(scan);
                        break;
                    case 4:
                        findById(scan);
                        break;
                    case 5:
                        visualizar();
                        break;
                    default:
                        system = false;
                        break;
                }

            }
        }


        private void salvar(Scanner scan) {

            System.out.println("ID do COLABORADOR");
            Integer id = scan.nextInt();

            System.out.println("Descrição");
            String descricao = scan.next();

//            System.out.println("Hora Início");
//            String shoraInicio = scan.next();

            //limpando o buffer do teclado
            scan.nextLine();

            System.out.println("Data e Hora Final: dd/MM/yyyy HH:mm");
            String shoraFim = scan.nextLine();

            //limpando o buffer do teclado
            scan.nextLine();

            System.out.println(shoraFim);

            System.out.println("Status da Tarefa");
            String status = scan.next();

            System.out.println("Prioridade da Tarefa");
            String prioridade = scan.next();

            Tarefa tarefa = new Tarefa();
            tarefa.setDescrTarefa(descricao);
            tarefa.setDataHoraInicio(LocalDateTime.now());
            tarefa.setDataHoraFim(LocalDateTime.parse(shoraFim, formatter));

//            LocalDateTime horaFim = LocalDateTime.parse(shoraFim,formatter);
//            System.out.println(horaFim);

            tarefa.setStatusTarefa(status);
            tarefa.setPrioridadeTarefa(prioridade);

            Optional<Colaborador> colaborador = colaboradorRepository.findById(id);
            tarefa.setColaborador(colaborador.get());

            tarefaRepository.save(tarefa);

            //colaboradorRepository.save(colaborador);
            System.out.println(tarefa);
            System.out.println("Tarefa Salva!");
        }

        private void atualizar(Scanner scan) {

            System.out.println("Digite o ID que deseja alterar");
            int id = scan.nextInt();

            Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);

            System.out.println("Descrição");
            String descricao = scan.next();

            System.out.println("Status da Tarefa");
            String status = scan.next();

            System.out.println("Prioridade da Tarefa");
            String prioridade = scan.next();

            Tarefa tarefa = tarefaOptional.get();

            tarefa.setDescrTarefa(descricao);
            tarefa.setStatusTarefa(status);
            tarefa.setPrioridadeTarefa(prioridade);

            //Optional<Colaborador> colaborador = colaboradorRepository.findById(id);
            //tarefa.setColaborador(colaborador.get());

            tarefaRepository.save(tarefa);

            System.out.println(tarefa);
            System.out.println("Tarefa Alterada!");

//            Colaborador colaborador = new Colaborador();
//            colaborador.setNomeColaborador(nome);
//            colaborador.setIdColaborador(id);
//
//            colaboradorRepository.save(colaborador);
//            System.out.println("Colaborador Alterado!");
        }

        private void visualizar() {
            Iterable<Tarefa> tarefas = tarefaRepository.findAll();
            tarefas.forEach(t -> System.out.println(t));

        }

        private void findById(Scanner scan){

            System.out.println("Digite o ID que deseja pesquisar");
            int id = scan.nextInt();

            Optional<Tarefa> tarefa = tarefaRepository.findById(id);
            System.out.println(tarefa);

        }

        private void deletar(Scanner scan) {
            System.out.println("Digite o ID que deseja deletar");
            int id = scan.nextInt();
            tarefaRepository.deleteById(id);
            System.out.println("Deletado");


        }

    }







