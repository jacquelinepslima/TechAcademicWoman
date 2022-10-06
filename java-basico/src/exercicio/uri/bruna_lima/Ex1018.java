package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int notas = 0;

        System.out.println(n);

        System.out.println(n / 100 + " nota(as) de R$ 100,00");
        notas = n % 100;
        System.out.println(notas / 50 + " nota(as) de R$ 50,00");
        notas = notas % 50;
        System.out.println(notas / 20 + " nota(as) de R$ 20,00");
        notas = notas % 20;
        System.out.println(notas / 10 + " nota(as) de R$ 10,00");
        notas = notas % 10;
        System.out.println(notas / 5 + " nota(as) de R$ 5,00");
        notas = notas % 5;
        System.out.println(notas / 2 + " nota(as) de R$ 2,00");
        notas = notas % 2;
        System.out.println(notas / 1 + " nota(as) de R$ 1,00");

        entrada.close();
    }
}
