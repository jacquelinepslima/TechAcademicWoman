package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int resto;

        int nota100 = valor / 100;
        resto = valor % 100;

        int nota50 = resto / 50;
        resto = resto % 50;

        int nota20 = resto / 20;
        resto = resto % 20;

        int nota10 = resto / 10;
        resto = resto % 10;

        int nota5 = resto / 5;
        resto = resto % 5;

        int nota2 = resto / 2;
        resto = resto % 2;

        int nota1 = resto;

        System.out.println(nota100 + " nota (s) de R$ 100,00");
        System.out.println(nota50 + " nota (s) de R$ 50,00");
        System.out.println(nota20 + " nota (s) de R$ 20,00");
        System.out.println(nota10 + " nota (s) de R$ 10,00");
        System.out.println(nota5 + " nota (s) de R$ 5,00");
        System.out.println(nota2 + " nota (s) de R$ 2,00");
        System.out.println(nota1 + " nota (s) de R$ 1,00");
    }
}