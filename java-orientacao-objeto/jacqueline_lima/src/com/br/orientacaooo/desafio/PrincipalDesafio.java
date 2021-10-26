package com.br.orientacaooo.desafio;

import com.br.orientacaooo.desafio.Pessoa;

public class PrincipalDesafio {
    public static void main(String[] args) {

        Pessoa n = new Pessoa("Carlos Silva");
        n.setIdade(33);

        System.out.println("nome: " + n.getNome());
        System.out.println("idade: " + n.getIdade());

        /* Pessoa n = new Pessoa();
        n.setNome("Carlos Silva");
        n.setIdade(33);
        System.out.println("nome: " + n.getNome());
        System.out.println("idade: " + n.getIdade());*/

        /* Pessoa n = new Pessoa();

        n.nome = "Carlos Silva";
        n.idade = 33;
        n.endereco = "Rua 9";

        System.out.println("nome: " + n.nome);
        System.out.println("idade: " + n.idade);
        System.out.println("endereço: " + n.endereco);*/
    }
}
