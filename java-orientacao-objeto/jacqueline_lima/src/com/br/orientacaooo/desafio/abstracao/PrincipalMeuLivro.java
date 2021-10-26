package com.br.orientacaooo.desafio.abstracao;

import com.br.orientacaooo.desafio.heranca_constructor_sobrecarga.Programador;

import java.util.Scanner;

public class PrincipalMeuLivro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro n = new Livro("Senhor dos Anéis");
        System.out.println(n);

        sc.close();
    }
}
