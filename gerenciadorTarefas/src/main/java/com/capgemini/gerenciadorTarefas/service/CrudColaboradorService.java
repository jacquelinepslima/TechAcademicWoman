package com.capgemini.gerenciadorTarefas.service;

import com.capgemini.gerenciadorTarefas.model.Colaborador;
import org.springframework.stereotype.Service;
import com.capgemini.gerenciadorTarefas.repository.ColaboradorRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudColaboradorService {

    private final ColaboradorRepository colaboradorRepository;
    private Boolean system = true;

    public CrudColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    public void inicial(Scanner scan) {

        while (system) {
            System.out.println("Qual ação de COLABORADOR deseja executar");
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
        System.out.println("Nome");
        String nome = scan.next();

        Colaborador colaborador = new Colaborador();
        colaborador.setNomeColaborador(nome);

        colaboradorRepository.save(colaborador);
        System.out.println("Colaborador Salvo! ");
    }

    private void atualizar(Scanner scan) {
        System.out.println("Digite o ID que deseja alterar");
        int id = scan.nextInt();

        System.out.println("Nome");
        String nome = scan.next();

        Colaborador colaborador = new Colaborador();
        colaborador.setNomeColaborador(nome);
        colaborador.setIdColaborador(id);

        colaboradorRepository.save(colaborador);
        System.out.println("Colaborador Alterado!");
    }

    private void visualizar() {
        Iterable<Colaborador> colaboradores = colaboradorRepository.findAll();
        colaboradores.forEach(c -> System.out.println(c));

    }

    private void deletar(Scanner scan) {
        System.out.println("Digite o ID que deseja deletar");
        int id = scan.nextInt();
        colaboradorRepository.deleteById(id);
        System.out.println("Deletado");


    }

    private void findById(Scanner scan){

        System.out.println("Digite o ID que deseja alterar");
        int id = scan.nextInt();

        Optional<Colaborador> colaborador = colaboradorRepository.findById(id);
        System.out.println(colaborador);
    }

}





