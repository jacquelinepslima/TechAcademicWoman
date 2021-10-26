package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double N;

        do {
            N = scanner.nextDouble();
        } while ((N >= 1000000.00) || (N < 0));


        double qtd100 = 0, qtd50 = 0, qtd20 = 0, qtd10 = 0, qtd5 = 0, qtd2 = 0, qtd1 = 0;
        double qtd050 = 0, qtd025 = 0, qtd010 = 0, qtd005 = 0, qtd001 = 0;

        qtd100 = N / 100;
        N %= 100;
        qtd50 = N / 50;
        N %= 50;
        qtd20 = N / 20;
        N %= 20;
        qtd10 = N / 10;
        N %= 10;
        qtd5 = N / 5;
        N %= 5;
        qtd2 = N / 2;
        N %= 2;

        qtd1 = N / 1;
        N %= 1;
        qtd050 = N / 0.50;
        N %= 0.50;
        qtd025 = N / 0.25;
        N %= 0.25;
        qtd010 = N / 0.10;
        N %= 0.10;
        qtd005 = N / 0.05;
        N %= 0.05;
        qtd001 = N / 0.01;
        N %= 0.01;

        System.out.println("Notas:");
        System.out.println((int) qtd100 + " nota(s) de R$ 100.00");
        System.out.println((int) qtd50 + " nota(s) de R$ 50.00");
        System.out.println((int) qtd20 + " nota(s) de R$ 20.00");
        System.out.println((int) qtd10 + " nota(s) de R$ 10.00");
        System.out.println((int) qtd5 + " nota(s) de R$ 5.00");
        System.out.println((int) qtd2 + " nota(s) de R$ 2.00");

        System.out.println("Moedas: ");
        System.out.println((int) qtd1 + " moeda(s) de R$ 1.00");
        System.out.println((int) qtd050 + " moeda(s) de R$ 0.50");
        System.out.println((int) qtd025 + " moeda(s) de R$ 0.25");
        System.out.println((int) qtd010 + " moeda(s) de R$ 0.10");
        System.out.println((int) qtd005 + " nota(s) de R$ 0.05");
        System.out.println((int) qtd001 + " nota(s) de R$ 0.01");

        scanner.close();
    }
}
