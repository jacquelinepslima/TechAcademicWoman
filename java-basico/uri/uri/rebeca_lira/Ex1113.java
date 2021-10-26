package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente.");
            } else {
                System.out.println("Decrescente.");
            }

        X = scanner.nextInt();
        Y = scanner.nextInt();
        }

        scanner.close();
    }
}
