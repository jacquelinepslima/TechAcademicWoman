package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int y = 0; y < N; y++) {
            int X = scanner.nextInt();
            if (X == 0) {
                System.out.println("NULL");
            } else if (X % 2 == 0 && X > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X % 2 == 0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X % 2 != 0 && X > 0) {
                System.out.println("ODD POSITIVE");
            } else if (X % 2 != 0 && X < 0) {
                System.out.println("ODD NEGATIVE");
            }
        }

        scanner.close();
    }
}
