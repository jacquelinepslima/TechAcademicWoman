package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
        int soma;

        System.out.println("Escreva o número 1: ");
        A = scanner.nextInt();

        System.out.println("Escreva o número 2: ");
        B = scanner.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
