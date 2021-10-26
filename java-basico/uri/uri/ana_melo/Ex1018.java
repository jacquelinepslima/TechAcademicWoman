package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois, notaUm, resto;

        notaCem = n / 100;
        resto = n % 100;
        notaCinq = resto / 50;
        resto = resto % 50;
        notaVinte = resto / 20;
        resto = resto % 20;
        notaDez = resto / 10;
        resto = resto % 10;
        notaCinco = resto / 5;
        resto = resto % 5;
        notaDois = resto / 2;
        notaUm = resto % 2;

        System.out.printf("%d%n", n);
        System.out.printf("%d nota(s) de R$ 100,00%n", notaCem);
        System.out.printf("%d nota(s) de R$ 50,00%n", notaCinq);
        System.out.printf("%d nota(s) de R$ 20,00%n", notaVinte);
        System.out.printf("%d nota(s) de R$ 10,00%n", notaDez);
        System.out.printf("%d nota(s) de R$ 5,00%n", notaCinco);
        System.out.printf("%d nota(s) de R$ 2,00%n", notaDois);
        System.out.printf("%d nota(s) de R$ 1,00%n", notaUm);

        sc.close();
    }
}
