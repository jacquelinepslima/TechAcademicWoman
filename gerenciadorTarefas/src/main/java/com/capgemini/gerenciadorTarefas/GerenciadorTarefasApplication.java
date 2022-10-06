package com.capgemini.gerenciadorTarefas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.capgemini.gerenciadorTarefas.service.CrudColaboradorService;
import com.capgemini.gerenciadorTarefas.service.CrudTarefaService;

import java.util.Scanner;

@EnableJpaRepositories
@SpringBootApplication
public class GerenciadorTarefasApplication implements CommandLineRunner {


	private boolean system = true;

	//injeção de dependência
	private final CrudColaboradorService colaboradorService;
	private final CrudTarefaService tarefaService;

	public GerenciadorTarefasApplication(CrudColaboradorService colaboradorService, CrudTarefaService tarefaService) {
		this.colaboradorService = colaboradorService;
		this.tarefaService = tarefaService;
	}


	public static void main(String[] args) {
		SpringApplication.run(GerenciadorTarefasApplication.class, args);
	}


	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (system) {
			System.out.println("Qual função deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Colaborador");
			System.out.println("2 - Tarefa");
//			System.out.println("3 - Unidade");
//			System.out.println("4 - Relatórios");

			Integer function = scanner.nextInt();

			switch (function) {
				case 1:
					colaboradorService.inicial(scanner);
					break;
				case 2:
					tarefaService.inicial(scanner);
					break;
				default:
					System.out.println("Finalizando");
					system = false;
					break;
			}
		}
	}













}
