package server;

import model.dao.CachorroDAO;
import model.dao.DonoDAO;
import model.entity.Cachorro;
import model.entity.DonoAnimal;


import java.sql.SQLException;
import java.util.Scanner;

public class PrincipalZoo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        CachorroDAO cachorroDAO = new CachorroDAO();
        DonoDAO donoDAO = new DonoDAO();

        Scanner entrada = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("\n\n### PETSHOP - Cadastro de Animais ###");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Cadastrar animal         |");
            System.out.println("                  |     2 - Cadastrar um(a) dona(o)     |");
            System.out.println("                  |     3 - Alterar o nome do animal        |");
            System.out.println("                  |     4 - Alterar o nome da(o) dona(o)       |");
            System.out.println("                  |     5 - Visualizar as informações de um animal      |");
            System.out.println("                  |     6 - Visualizar as informações de todos os animais    |");
            System.out.println("                  |     7 - Visualizar as informações de um animal conforme o dono          |");
            System.out.println("                  |     8 - Visualizar a idade de um animal          |");
            System.out.println("                  |     0 - Fim          |");
            System.out.println("                  =========================\n");
            System.out.println("                  |     Qual opção deseja fazer?");



            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("\n Até logo!");
                sc.close();
            }

            switch(opcao){
                case 1:

                    System.out.println();
                    System.out.println("Quantos animais deseja cadastrar?");
                    int quantidade = sc.nextInt();
                    int i = 0;

                    while (i < quantidade){
                        System.out.println("Digite os dados solicitados dos animais: ");
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Data de nascimento: ");
                        String dataNascimento = sc.nextLine();
                        System.out.println("Espécie: ");
                        String especie = sc.next();
                        System.out.println("Raça: ");
                        String raca = sc.nextLine();
                        System.out.println("Cor: ");
                        String cor = sc.nextLine();
                        System.out.println("Sexo: ");
                        String sexo = sc.nextLine();
                        System.out.println("Código do dono: ");
                        int codigoDono = sc.nextInt();

                        //if

                        Cachorro cachorro = new Cachorro(nome, dataNascimento, raca, cor, sexo, codigoDono);
                        cachorroDAO.save(cachorro);

                        i++;
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("-------Dados da(o) dona(o)-------");
                    System.out.println();
                    System.out.println("Digite os dados abaixo: ");
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Endereço: ");
                    String endereco = sc.next();

                    DonoAnimal donoAnimal = new DonoAnimal(nome, endereco);
                    donoDAO.save(donoAnimal);

                    break;

                case 3:
                    System.out.println();
                    System.out.println("-------Encontrar o animal e seu respectivo dono-------");
                    System.out.println();
                    System.out.println("Digite o código do animal: ");
                    int codigoAnimal = sc.nextInt();
                    System.out.println("Digite o código do dono do animal: ");
                    int codigoDono = sc.nextInt();

                    donoDAO.findById(codigoAnimal, codigoDono);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("-------Alterar o nome do animal-------");
                    System.out.println();
                    System.out.println("Digite o código do animal: ");
                    Cachorro cNomeNovo = new Cachorro();
                    cNomeNovo.setCodigoCachorro(sc.nextInt());
                    System.out.println("Digite o novo nome do animal: ");
                    CachorroDAO cNomeAtualizado = new CachorroDAO();
                    cNomeAtualizado.merge(cNomeNovo);

                    break;

                case 5:
                    System.out.println();
                    System.out.println("-------Alterar o nome da(o) dona(o)-------");
                    System.out.println();
                    System.out.println("Digite o código da(o) dona(o): ");
                    DonoAnimal novoNome = new DonoAnimal();
                    novoNome.setCodigoDono(sc.nextInt());
                    System.out.println("Digite o novo dona(o): ");
                    DonoDAO nomeAtualizado = new DonoDAO();
                    nomeAtualizado.merge(novoNome);


                    break;

                case 6:
                    System.out.println();
                    System.out.println("-------Encontrar o animal através do código-------");
                    System.out.println();
                    System.out.println("Digite o código do animal: ");
                    codigoAnimal = sc.nextInt();
                    System.out.println(cachorroDAO.findById(codigoAnimal));
                    break;

                case 7:
                    System.out.println();
                    System.out.println("-------Listagem de todos os animais-------");
                    CachorroDAO listaAnimais = new CachorroDAO();
                    System.out.println(listaAnimais.findAll());
                    break;

                case 8:
                    System.out.println();
                    System.out.println("Digite o código do animal que deseja saber a idade: ");
                    codigoAnimal = sc.nextInt();

                    Cachorro c1 = cachorroDAO.findById(codigoAnimal);

                    System.out.println("O animal " + c1.getNomeAnimal() + " tem " + cachorroDAO.idade(c1) + " ano(s).");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        sc.close();
    }
}