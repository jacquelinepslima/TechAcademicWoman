package com.br.orientacaooo.desafio.sobrecarga;


import java.util.Scanner;

public class PrincipalDesafioSobrecarga {
    public static void main(String[] args) {
        AnimalDesafio a = new GatoDesafio();

        Scanner sc = new Scanner(System.in);
        a.setNome(sc.nextLine());

        System.out.println(a.getEspecie());
    }
}
