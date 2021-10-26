package com.br.orientacaooo.desafio.heranca_constructor_sobrecarga;

import java.util.Scanner;


public class PrincipalProgramador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o nome");
        String nome = sc.next();
        System.out.println("Digite a idade");
        int idade = sc.nextInt();
        System.out.println("Digite a linguagem favorita");
        String linguagem = sc.next();

        //processamento
        Programador p = new Programador(nome, idade, linguagem);

        //apresentacao das informacoes
        /* p.showInfo();
        sc.close();*/

        System.out.println(p.showInfo());

        sc.close();
    }
}
