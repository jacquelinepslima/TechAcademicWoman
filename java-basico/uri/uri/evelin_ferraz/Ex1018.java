package exercicio.uri.evelin_inajara;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int num = scanner.nextInt();
        int restoDivisao;

        int notas100 = num / 100;
        restoDivisao = num % 100;

        int notas50 = restoDivisao / 50 ;
        restoDivisao = restoDivisao % 50;

        int notas20 = restoDivisao / 20;
        restoDivisao = restoDivisao % 20;

        int notas10 = restoDivisao / 10;
        restoDivisao = restoDivisao % 10;

        int notas5 = restoDivisao / 5;
        restoDivisao = restoDivisao % 5;

        int notas2 = restoDivisao / 2;
        restoDivisao = restoDivisao % 2;

        int notas1 = restoDivisao;

        System.out.println(num);
        System.out.printf("%d nota(s) de R$100,00%n", notas100);
        System.out.printf("%d nota(s) de R$50,00%n", notas50);
        System.out.printf("%d nota(s) de R$20,00%n", notas20);
        System.out.printf("%d nota(s) de R$10,00%n", notas10);
        System.out.printf("%d nota(s) de R$5,00%n", notas5);
        System.out.printf("%d nota(s) de R$2,00%n", notas2);
        System.out.printf("%d nota(s) de R$1,00%n", notas1);

        scanner.close();
    }
}
