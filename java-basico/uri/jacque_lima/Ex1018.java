package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            N = scanner.nextInt();
        }while ((N > 1000000) || (N < 0));


        int valorTotal = N;
        int qtd100 = 0, qtd50 = 0, qtd20 = 0, qtd10 = 0, qtd5 = 0, qtd2 = 0, qtd1 = 0;

        qtd100 = valorTotal / 100;
        valorTotal %= 100;
        qtd50 = valorTotal / 50;
        valorTotal %= 50;
        qtd20 = valorTotal / 20;
        valorTotal %= 20;
        qtd10 = valorTotal / 10;
        valorTotal %= 10;
        qtd5 = valorTotal / 5;
        valorTotal %= 5;
        qtd2 = valorTotal / 2;
        valorTotal %= 2;
        qtd1 = valorTotal / 1;
        valorTotal %= 1;

        System.out.println(N);
        System.out.println(qtd100 + " nota(s) de R$ 100,00");
        System.out.println(qtd50 + " nota(s) de R$ 50,00");
        System.out.println(qtd20 + " nota(s) de R$ 20,00");
        System.out.println(qtd10 + " nota(s) de R$ 10,00");
        System.out.println(qtd5 + " nota(s) de R$ 5,00");
        System.out.println(qtd2 + " nota(s) de R$ 2,00");
        System.out.println(qtd1 + " nota(s) de R$ 1,00");

        scanner.close();
    }
}
