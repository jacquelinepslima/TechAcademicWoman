package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;
        int result;

        System.out.println("Escreva os 4 números: ");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        result = (A * B - C * D);

        System.out.println("DIFERENÇA = " + result);

        scanner.close();
    }
}
