package com.br.orientacaooo.desafio.formulacirculo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Implementei:Forma %.2f", area);

        sc.close();
    }

    //  A formulá da área do círculo é "a = π x r2"
    //método Math.pow() e da constante Math.PI.
    // entrada de dados - 15
    //saida de dados - implementei:forma 706.86
}
